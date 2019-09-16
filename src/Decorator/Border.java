package Decorator;

// 装饰边框的抽象类
public abstract class Border extends Display{
    protected Display display; // 被装饰物, 委托适配器

    protected Border(Display display) {
        this.display = display;
    }
}
