package ChainOfResponsibility;

public abstract class Support {
    private String name;
    private Support next; // 下一个处理者

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 模板方法
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) { // 将问题交个下一个处理者.
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public String toString() {
        return name;
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is solved by " + this);
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " can not be solved.");
    }
}
