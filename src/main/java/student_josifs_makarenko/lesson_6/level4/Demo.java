package student_josifs_makarenko.lesson_6.level4;

public class Demo {
    public static void main(String[] args) {
        WhileInfiniteLoop whileInfiniteLoop = new WhileInfiniteLoop();
        ForInfiniteLoop forInfiniteLoop = new ForInfiniteLoop();
        WhileInfiniteLoopBreak whileInfiniteLoopBreak = new WhileInfiniteLoopBreak();
        ForInfiniteLoopBreak forInfiniteLoopBreak = new ForInfiniteLoopBreak();
        ForLoopContinue forLoopContinue = new ForLoopContinue();
        WhileLoopContinue whileLoopContinue = new WhileLoopContinue();

        whileLoopContinue.loopContinue();
        forLoopContinue.loopContinue();

        forInfiniteLoopBreak.infiniteLoop();
        System.out.println("end");

        whileInfiniteLoopBreak.infinityLoop();
        System.out.println("end");

        //whileInfiniteLoop.infinityLoop();
        //System.out.println("end");

        //forInfiniteLoop.infiniteLoop();
        //System.out.println("end");

    }
}
