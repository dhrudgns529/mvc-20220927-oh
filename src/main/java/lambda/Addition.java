package lambda;

@FunctionalInterface // 하나의 메소드만... (람다로 사용하려고 만든 것임을 말해줌)
public interface Addition {
    public int add(int[] numbers);
}
