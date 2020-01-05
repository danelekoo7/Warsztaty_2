package pl.coderslab;

import pl.coderslab.dao.SolutionDao;
import pl.coderslab.model.Solution;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class TestSolution {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Solution solution = new Solution(3, timestamp, null, "coos", 15, 2);
        SolutionDao solutionDao = new SolutionDao();
//        solutionDao.create(solution);
//        solutionDao.update(solution);
        Solution solution1 = solutionDao.read(3);
        solutionDao.create(solution1);

//        solutionDao.printSolution(solution);

        Solution[] solutions = solutionDao.findAll();

//
//        for (int i = 0; i < solutions.length; i++) {
//            solutionDao.printSolution(solutions[i]);
//        }

//        for (int i = 0; i <solutionDao.findAll().length ; i++) {
//            solutionDao.printSolution(solutionDao.findAll()[i]);
//        }

//        for (int i = 0; i < solutionDao.findAllByUserId(1).length; i++) {
//            solutionDao.printSolution(solutionDao.findAllByUserId(1)[i]);
//        }

        for (int i = 0; i < solutionDao.findAllByExerciseId(2).length; i++) {
            solutionDao.printSolution(solutionDao.findAllByExerciseId(2)[i]);
        }
    }
}


