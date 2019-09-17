package Facade.pageMaker;

import java.io.IOException;
import java.io.Writer;

class MdWriter {
    private Writer writer;

    public MdWriter(Writer writer) {
        this.writer = writer;
    }

    // 输出标题
    public void title(String title) throws IOException {
        writer.write("###" + title + "\n\n");
    }

    // 输出段落
    public void paragraph(String msg) throws IOException {
        writer.write("    " + msg + "\n\n");
    }

    // 输出超链接
    public void link(String href, String desc) throws IOException {
        writer.write("[" + desc + "](" + href + ")" + "\n\n");
    }

    // 结束
    public void close() throws IOException {
        writer.close();
    }
}
