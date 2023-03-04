<<<<<<< HEAD
package boris.maths;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public Result doAddition(int no1, int no2) {
        Result result = new Result(no1 + no2, "Finish Addition!");
        return result;
    }

    public Result doSubtraction(int no1, int no2) {
        Result result = new Result(no1 - no2, "Finish Subtraction!");
        return result;
    }
}
=======
package boris.maths;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public Result doAddition(int no1, int no2) {
        Result result = new Result(no1 + no2, "Finish Addition!");
        return result;
    }

    public Result doSubtraction(int no1, int no2) {
        Result result = new Result(no1 - no2, "Finish Subtraction!");
        return result;
    }
}
>>>>>>> 1c6a49a (TESTCNCAWSDEVOPS)
