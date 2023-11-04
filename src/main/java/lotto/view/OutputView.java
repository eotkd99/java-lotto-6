package lotto.view;

import lotto.domain.Lotto;
import lotto.util.OutPutMessage;
import java.util.List;

public class OutputView {
    public void printChances(int chance) {
        System.out.println(String.valueOf(chance) + OutPutMessage.OUTPUT_MONEY_MESSAGE);
    }

    public void printLotto(List<Lotto> generatedLotto) {
        for (Lotto lotto : generatedLotto) {
            System.out.println(lotto.getNumbers());
        }
    }
}
