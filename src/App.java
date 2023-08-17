public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Conta co = new Conta();
        co.numero = 857684;
        co.saldo = 500;
        co.tipoconta = "Conta Corrente";

            Cliente c = new Cliente();
            c.nome = "julius";
            c.Telefone = 98887-6423;
            c.cpf = 142.570-13;
            c.endereço = "Rua marques de baipendi";

                Agencia a = new Agencia();
                a.nome = "Jubileus";
                a.endereço = "Encruzilhada,456";
                a.Telefone = 98849-4893;
                a.ndAgencia = 132453;

                    Banco b = new Banco();
                    b.cnpj = 879798090;
                    b.endereço= "Julin, 45";
                    b.nome = "Banco julius";
                    b.telefone = 2566-9044;

                        Transacao t = new Transacao();
                        t.codTran = 4256;
                        t.tipoTran = "ted";
                        t.datEhora = "12/04/2023 ás 15h";
                        t.valor = 500.00;

                            Atendimento at = new Atendimento();
                            at.codAtendimento = 236794;
                            at.datEhorain = "16/05/2023 ás 16h";
                            at.datEhorafim = "18/08/2023 ás 17h";
                    

                        

System.out.println("Dados agencia: \nnome: "+ a.nome+ " \nendereço: " + a.endereço+ " \nendereço: "+ a.endereço+ ",\ntelefone: " + a.Telefone+ "\n");

System.out.println("Dados conta: \nconta: "+co.numero + " \nsaldo : " +co.saldo + " \nconta: " + co.tipoconta+ "\n" );


System.out.println("Dados cliente: \nnome : " +c.nome+" \ntelefone: " +c.Telefone+ " \ncpf: " + c.cpf+ "\nendereço: " + c.endereço+ "\n" );

System.out.println("Dados do Banco: \nnome: " +b.nome+" \ntelefone: " +b.telefone+ " \ncnpj: " + b.cnpj+ "\nendereço: " + c.endereço+ "\n" );

System.out.println("Dados da transação : \nCódigo de transação:: " +t.codTran+" \ntransação: " +t.tipoTran+ " \ndata e hora da realização: " + t.datEhora+ "\ntransação: " + t.valor+ "\n"  );

System.out.println("Dados do Atendimento: \nCódigo do atendimento: "+ at.codAtendimento+ " \nData e hora de início: " + at.datEhorain+ " \nData e hora de fim: "+ at.datEhorafim+ "\n");
    }
}
