package ca.vanier;

import org.junit.*;


public class PassTest {
    ScoreManager scoreManager=new ScoreManager();
    @Test
    public void testCase() {
double score=8;
        Assert.assertTrue(scoreManager.passscore(score));
    }
    @Test
    public void testCase2() {
        double score=5;
        boolean expectedResult=false;
        boolean actualResult=scoreManager.passscore(score);
       Assert.assertEquals("this is what we expect",expectedResult,actualResult);
    }
    @Test
    public void testCase3() {
        double score=5;
        boolean actualResult=scoreManager.passscore(score);
        Assert.assertFalse("this is must be false ",actualResult);
    }
}
