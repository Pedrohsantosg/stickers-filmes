import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {

  public void cria() throws Exception {

    // leitura da imagem
    BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));

    // cria nova imagem em memória com transparência e com tamanho novo
    int largura = imagemOriginal.getWidth();
    int altura = imagemOriginal.getHeight();
    int novaAltura = altura + 400;
    BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

    // copiar a imagem original pra novo imagem(em memória)
    Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
    graphics.drawImage(imagemOriginal, 0, 0, null);

    // escrever uma frase na imagem
    System.out.println();

    // escrever a nova imagem em um arquivo
    ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));

  }

  public static void main(String[] args) throws Exception {
    var geradora = new GeradoraDeFigurinhas();
    geradora.cria();
  }
}
