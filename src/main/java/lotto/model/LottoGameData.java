package lotto.model;

import lotto.util.Constants;
import lotto.util.ErrorMessage;

import java.util.regex.Pattern;

public class LottoGameData {
    private int chance;

    public int getChance() {
        return chance;
    }

    public void setChance(String input) {
        patternCheck(input, Constants.MONEY_PATTERN, ErrorMessage.MONEY_ERROR);
        this.chance=convertMoneyToChances(input);
    }

    public void patternCheck(String input, Pattern pattern, ErrorMessage e) {
        if(!pattern.matcher(input).matches()){
            throw new IllegalArgumentException(e.getMessage()+ErrorMessage.MONEY_ERROR);
        }
    }

    public int convertMoneyToChances(String input){
        return Integer.parseInt(input) / Constants.MONEY_UNIT;
    }
}
