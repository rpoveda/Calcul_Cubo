package calculo_cubo;

import java.util.Scanner;

/**
 *
 * @author rafaelpoveda
 */
public class Calculo_Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /// Recebe as informacoes
        System.out.println("---Calculo cubo---");
        double dblAltura = recebeValor("Digite a altura do cubo(em M):", "altura do cubo");
        double dblLargura = recebeValor("Digite a largura do cubo(em M):", "largura do cubo");
        double dblComprimento = recebeValor("Digite o comprimento do cubo(em M):", "comprimento do cubo");
        double dblCaixa = recebeValor("Digite o valor da caixa(em M):", "valor da caixa");
        
        ///calcula a dimensao do cubo
        double dblDimensoesCubo = dblAltura * dblLargura * dblComprimento;
        ///calcula a dimensao da caixa
        dblCaixa = dblCaixa * dblCaixa * dblCaixa;
        
        ///Exibe a msg de quantidade de caixas
        System.out.println("Cabe(m) " + Math.round(dblDimensoesCubo / dblCaixa) + " caixa(s) no cubo!");
        System.exit(0);
    }
    
    ///Metodo para receber os valores digitados pelo usuario
    ///Executa a validacao do valor recebido
    public static double recebeValor(String strMsg, String strTipo){
        boolean b = false;
        double var= 0;
        int count = 0;
        do{
            try{
            Scanner in = new Scanner(System.in);
            if(count <= 0)
                System.out.println(strMsg);
            else
                System.out.println("O valor de " + strTipo + " não pode ser negativo,0 ou letras.\n" + strMsg);
            var = in.nextDouble();
            b = (var == 0 || var < 0) ? true : false;
            }catch(Exception ex){
                b = true;
            }
            count++;
        }while(b);
        return var;
    }
}
