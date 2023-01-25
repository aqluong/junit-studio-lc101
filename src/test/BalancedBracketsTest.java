package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void bothBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOneLeftBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyOneRightBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void afterBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Mary had a little lamb []"));
    }
    @Test
    public void beforeBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Mary had a little lamb"));
    }
    @Test
    public void insideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Mary [had] a little lamb"));
    }
    @Test
    public void doubleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Mary] had [a] little lamb"));
    }
    @Test
    public void tripleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Mary] had [a] little [lamb]"));
    }
    @Test
    public void oppositeTwoBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Mary ]had ]a little lamb"));
    }
    @Test
    public void wrongDirectionBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Mary[ had a little lamb"));
    }
    @Test
    public void oppositeDirectionBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}
