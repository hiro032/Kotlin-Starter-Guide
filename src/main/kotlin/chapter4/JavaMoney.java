package chapter4;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {

	private final Long money;

	public JavaMoney(final Long money) {
		this.money = money;
	}

	/**
	 *  주어진 객체가 더 작으면 양수
	 *  같다면 0
	 *  크다면 음수를 리턴함.
	 */
	@Override
	public int compareTo(@NotNull final JavaMoney o) {
		return Long.compare(this.money, o.money);
	}
}
