package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.InputMessage;

public class InputView {
    public String inputMoney() {
        System.out.println(InputMessage.INPUT_MONEY_MESSAGE.getMessage());
        return Console.readLine();
    }

    public String inputLottoWin() {
        System.out.println(InputMessage.INPUT_LOTTO_WIN_MESSAGE.getMessage());
        return Console.readLine();
    }

    public String inputLottoBonus() {
        System.out.println(InputMessage.INPUT_LOTTO_BONUS_MESSAGE.getMessage());
        return Console.readLine();
    }
}
