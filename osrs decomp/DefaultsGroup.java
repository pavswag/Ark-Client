// 
// Decompiled by Procyon v0.5.36
// 

public class DefaultsGroup
{
    static final int ms = 2048;
    final int group;
    static final DefaultsGroup field3766;
    
    DefaultsGroup(final int n) {
        this.group = 1519432129 * n;
    }
    
    static {
        field3766 = new DefaultsGroup(3);
    }
    
    static int method2226(final int n, final Script script, final boolean b, final int n2) {
        try {
            final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
            if (1700 == n) {
                if (n2 <= 1047937166) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.itemId * -2006098851;
                return 1;
            }
            else if (1701 == n) {
                if (n2 <= 1047937166) {
                    throw new IllegalStateException();
                }
                if (-1 != -2006098851 * widget.itemId) {
                    if (n2 <= 1047937166) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.itemQuantity * 1336975799;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else {
                if (1702 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 55577617 * widget.childIndex;
                    return 1;
                }
                if (1707 == n) {
                    if (n2 <= 1047937166) {
                        throw new IllegalStateException();
                    }
                    final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                    final int n3 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b2;
                    if (widget.method1807(2072674187)) {
                        if (n2 <= 1047937166) {
                            throw new IllegalStateException();
                        }
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    interpreter_intStack[n3] = (b2 ? 1 : 0);
                    return 1;
                }
                else if (n == 1708) {
                    if (n2 <= 1047937166) {
                        throw new IllegalStateException();
                    }
                    return BufferedSource.method2214(widget, 590181687);
                }
                else {
                    if (n != 1709) {
                        return 2;
                    }
                    if (n2 <= 1047937166) {
                        throw new IllegalStateException();
                    }
                    return class4.method11(widget, -935305362);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qp.ag(" + ')');
        }
    }
}
