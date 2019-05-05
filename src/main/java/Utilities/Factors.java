package Utilities;

import java.util.List;

public class Factors {

    public static List<Double> REMAINING_ENERGIES;
    public static int NUM_OF_SENSORS;
    public static List<Double> P;

    public static int GA_LOOP = 500;
    public static int GA_TOURNAMENT_SIZE = 5;
    public static int GA_POPULATION_SIZE = 200;
    public static double GA_CROSSOVER_PROBABILITY = 0.5;
    public static double GA_MUTATION_PROBABILITY = 0.1;
    public static double GA_CHANGE_MUTATION_OPERATION_PROBABILITY = 0.15;
    public static int GA_CHOSEN_FITNESS_FUNCTION = 2;
    public static int GA_CHOSEN_CROSSOVER_FUNCTION = 1;
    public static int GA_CHOSEN_MUTATION_FUNCTION = 1;


    public static String DISTRIBUTION_ENERGY_PREFIX = "Uniform_distribution_energy/";
    public static String REMAINING_ENERGY_PREFIX = "";
    public static String DISTRIBUTION_LOCATION_PREFIX = "uniform_distribution_location/";

    public static String INPUTFILE_PATH_TO_DATA_FOLDER = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/Data/";
    public static String OUTPUT_PATH_TO_RESULT_FOLDER = "/home/dongocson/Documents/Work/Work/Document/LearningProgram/Project2/GA_NewModel/src/main/resources/Result/";
    public static String INPUTFILE_NAME = "u100.txt";
    public static String OUTPUTFILE_NAME = "u100-result.txt";

    public static double ALPHA = 0.5;
    public static double K = 0.002;

    public static double WCE_V = 5;
    public static double WCE_U = 5;
    public static double WCE_P_MOVE = 1;
    public static double SERVICE_STATION_X = 0;
    public static double SERVICE_STATION_Y = 0;

    public static double SENSOR_Emin = 540;
    public static double SENSOR_Emax = 8000;
}
