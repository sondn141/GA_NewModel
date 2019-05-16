package Algorithm.GAUtils.Operators.Crossover;

import Algorithm.GAUtils.Operators.OperatorInterfaces.CrossoverOperator;
import Algorithm.Individual;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class CircleCrossover implements CrossoverOperator {


    public Pair<Individual, Individual> execute(Individual indDad, Individual indMom){
        ArrayList<Integer> dad = indDad.getChromosome();
        ArrayList<Integer> mom = indMom.getChromosome();
        int numOfGene = dad.size();
        Integer[] child1 = new Integer[numOfGene];
        Integer[] child2 = new Integer[numOfGene];

        boolean[] isInCircle = new boolean[numOfGene];
        Arrays.fill(isInCircle, false);
        int circleIndex = 0;
        int circleNumber = 0;
        while(circleIndex < numOfGene ){
            while(circleIndex < numOfGene && isInCircle[circleIndex]){
                circleIndex ++;
            }
            if(circleIndex >= numOfGene) break;
            circleNumber ++;

            int begin = dad.get(circleIndex);
            int currentIndex = circleIndex;
            int check;

            do{
                check = mom.get(currentIndex);
                child1[currentIndex] = circleNumber % 2 == 1 ? dad.get(currentIndex) : check;
                child2[currentIndex] = circleNumber % 2 == 1 ? check : dad.get(currentIndex);
                isInCircle[currentIndex] = true;
                currentIndex = dad.indexOf(check);
            }while(check != begin);
        }
        return new Pair<>(new Individual(Arrays.asList(child1)), new Individual(Arrays.asList(child2)));
    }
}