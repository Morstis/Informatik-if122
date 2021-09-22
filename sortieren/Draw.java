import java.awt.*;

public class Draw<T extends Component> {

  private T component;
  private Graphics g;
  private long delay = 0;
  private int i = 0;
  private int size = 10;

  Draw(T component) {
    this.component = component;
    this.g = component.getGraphics();
    this.g.setColor(Color.BLUE);
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setColor(Color c) {
    this.g.setColor(c);
  }

  public void addDelay(long milis) {
    this.delay = milis;
  }

  public void next(Integer height) {
    g.drawRect(i * (size + size / 2), this.component.getHeight() - height * size - 1, size, height * 10);
    i++;
  }

  public void draw(Integer[] arr) {
    this.i = 0;
    g.clearRect(0, 0, this.component.getWidth(), this.component.getHeight());
    while (i < arr.length) {
      this.next(arr[i]);
      try {
        Thread.sleep(this.delay);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }

    }

  }

}
