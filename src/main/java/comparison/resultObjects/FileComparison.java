package comparison.resultObjects;

import comparison.algorithms.ComparisonAlgorithm;
import normalisation.elements.elementContainers.JavaFile;
import normalisation.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileComparison {


    public List<MethodComparison> getMethod_comparisons() {
        return method_comparisons;
    }

    private List<MethodComparison> method_comparisons = new ArrayList<>();
    private JavaFile file1;

    public JavaFile getFile1() {
        return file1;
    }

    public JavaFile getFile2() {
        return file2;
    }

    private JavaFile file2;
    int algorithm_score = 0;
    // TODO change
    int THRESHOLD = -1;


    public FileComparison(JavaFile file1, JavaFile file2, ComparisonAlgorithm alg){
        this.file1 = file1;
        this.file2 = file2;
        // get all method comparisons that exceed a certain similarity threshold
        method_comparisons = Util.compareMethods(file1, file2).stream()
                .filter(x -> x.getTotalScore() > THRESHOLD)
                .collect(Collectors.toList());
        algorithm_score = (int) (alg.compareFiles(file1, file2) * 100);
    }


    public int getScore(){
        return algorithm_score;
    }

    public String getName(){
        return file1.getFile().getName() + " <--> " + file2.getFile().getName();
    }

    public String getReport(){

        StringBuilder sb = new StringBuilder();
        sb.append("Text Comparison Algorithm Score " + algorithm_score + "\n\n");
        sb.append("Suspected Methods -> \n");
        for (MethodComparison method_comparison : method_comparisons) {
            sb.append(method_comparison.getReport() + "\n");
        }
        return sb.toString();
    }


}
