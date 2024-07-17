package com.api.api;
import java.util.Scanner;
public class Estado {
    
    public enum Ufs {
        AC(1, "Acre", "AC", Regioes.NORTE),
        AL(2, "Alagoas", "AL", Regioes.NORDESTE),
        AP(3, "Amapá", "AP", Regioes.NORTE),
        AM(4, "Amazonas", "AM", Regioes.NORTE),
        BA(5, "Bahia", "BA", Regioes.NORDESTE),
        CE(6, "Ceará", "CE", Regioes.NORDESTE),
        DF(7, "Distrito Federal", "DF", Regioes.CENTRO_OESTE),
        ES(8, "Espírito Santo", "ES", Regioes.SUDESTE),
        GO(9, "Goiás", "GO", Regioes.CENTRO_OESTE),
        MA(10, "Maranhão", "MA", Regioes.NORDESTE),
        MT(11, "Mato Grosso", "MT", Regioes.CENTRO_OESTE),
        MS(12, "Mato Grosso do Sul", "MS", Regioes.CENTRO_OESTE),
        MG(13, "Minas Gerais", "MG", Regioes.SUDESTE),
        PA(14, "Pará", "PA", Regioes.NORTE),
        PB(15, "Paraíba", "PB", Regioes.NORDESTE),
        PR(16, "Paraná", "PR", Regioes.SUL),
        PE(17, "Pernambuco", "PE", Regioes.NORDESTE),
        PI(18, "Piauí", "PI", Regioes.NORDESTE),
        RJ(19, "Rio de Janeiro", "RJ", Regioes.SUDESTE),
        RN(20, "Rio Grande do Norte", "RN", Regioes.NORDESTE),
        RS(21, "Rio Grande do Sul", "RS", Regioes.SUL),
        RO(22, "Rondônia", "RO", Regioes.NORTE),
        RR(23, "Roraima", "RR", Regioes.NORTE),
        SC(24, "Santa Catarina", "SC", Regioes.SUL),
        SP(25, "São Paulo", "SP", Regioes.SUDESTE),
        SE(26, "Sergipe", "SE", Regioes.NORDESTE),
        TO(27, "Tocantins", "TO", Regioes.NORTE);
    







        private final String nome;
        private final String uf;
        private final int id;
        private final Regioes regiao;
        
        Ufs(int id, String nome, String uf, Regioes regiao) {
            this.id = id;
            this.nome = nome;
            this.uf = uf;
            this.regiao = regiao;
        }

        public String getNome() {
            return nome;
        }

        public String getUf() {
            return uf;
        }

        public int getId() {
            return id;
        }
        public Regioes getRegiao(){
            return regiao;
            
        }
    }

    public static void listaEstadoRegiao(String regiao){

    }

   static void  perguntas(){
   Scanner sc = new Scanner(System.in);
    
   System.out.println("Escolha uma das seguintes UFs: ");

   for (Ufs uf : Ufs.values()) {
       System.out.println(uf.getId() + ": " + uf.getUf());
   }

   System.out.print("Digite o número correspondente a UF que você quer: ");
   int choice = sc.nextInt();
   Ufs selectedUf = null;
   
   for (Ufs uf : Ufs.values()) {
       if (uf.getId() == choice) {
           selectedUf = uf;
           break;
       }
    
    }
    if (selectedUf != null) {
       System.out.println("Você escolheu o ID: " + selectedUf.getId() + " " + selectedUf.getNome() + " (" + selectedUf.getUf() + ") " + " " + "Região:" + " " + selectedUf.getRegiao());
   } else {
       System.out.println("Escolha inválida!");
   }
  
     }
             }
    


 