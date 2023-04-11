package br.dev.techstack.userapi.models;

import java.util.Calendar;
import java.util.Date;

public class Generation {

    public static String calc (int age){

        Date date = new Date(); // sua instancia Date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int yearGeneration = year - age - 1;

        if(yearGeneration <= 1935){
            return "Geração Gold";
        }else if (yearGeneration <= 1959) {
            return "Geração Baby Boomers";
        }else if (yearGeneration <= 1979) {
            return "Geração X";
        }else if (yearGeneration <= 1994) {
            return "Geração Y";
        }else if (yearGeneration <= 2010) {
            return "Geração Z";
        }else if (yearGeneration <= year) {
            return "Geração Alpha";
        }else return "Geração Desconhecida";
    }

    public static String desc (int age){

        Date date = new Date(); // sua instancia Date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int yearGeneration = year - age - 1;

        if(yearGeneration <= 1935){
            return "Estes provavelmente tem muita sabedoria e já vivenciaram bastante coisa, vendo todo tipo de mudança na sociedade ao redor do mundo.";
        }else if(yearGeneration <= 1959){
            return "Nesta geração estão indivíduos que viveram as grandes transformações do pós-guerra. Em geral, criados com muita rigidez e disciplina, cresceram focados e obstinados e valorizam muito o trabalho, a família, a realização pessoal, a estabilidade financeira e a busca por melhores condições de vida.";
        }else if (yearGeneration <= 1979) {
            return "Essas geração de pessoas vivenciaram a fase da Guerra Fria e sentiram as transformações provocadas por movimentos de grande impacto no cenário social e cultural, como Maio de 68, a onda hippie e a luta por direitos políticos e sociais." +
                    "No Brasil, as crianças nascidas nessa fase testemunharam a ditadura militar e seu declínio, o desenvolvimento industrial e o crescimento econômico. Em um mercado de trabalho cada vez mais competitivo, as pessoas dessa geração dão valor ao diploma formal e à capacitação e estabilidade profissional. ";
        }else if (yearGeneration <= 1994) {
            return "Essa geração presenciou a chegada do novo milênio ainda criança ou bem jovem. Considerada criativa e alinhada às causas sociais, não tem como prioridades o trabalho intenso, a formação de uma família e a busca por estabilidade na carreira, ao contrário das gerações anteriores. " +
                    "Acostumados com a tecnologia, são multitarefas, impulsivos, competitivos, questionadores e desejam rápido crescimento profissional e financeiro. " +
                    "Um estudo do Itaú BBA mostra que a maior fatia da população do Brasil é de Millennials, que compõem 50% da força de trabalho do  país.";
        }else if (yearGeneration <= 2010) {
            return "Os jovens dessa geração nasceram a partir de 1995 e são considerados nativos digitais, ou seja, convivem com o universo da internet, mídias sociais e recursos tecnológicos desde o nascimento. Além disso, são multifocais e aprendem de várias maneiras, usando múltiplas fontes e objetos de aprendizagem. " +
                    "Costumam acompanhar os acontecimentos em tempo real, comunicam-se intensamente por meios digitais e estão sempre online. Em termos de comportamento, tendem a se engajar em questões ambientais, sociais e identitárias.";
        }else if (yearGeneration <= year) {
            return "A exposição à tecnologia e a telas é ainda mais forte nessa geração. Com muitos estímulos e acostumados a usar meios digitais para se entreter e buscar informações, requerem uma educação mais dinâmica, ativa, multiplataforma e personalizada. " +
                    "Essas crianças e jovens têm como características a flexibilidade, a autonomia e um potencial maior para inovar e buscar soluções para problemas de forma colaborativa. Gostam de ser protagonistas, colocar a mão na massa e aprender com situações concretas. ";
        }else return "Geração Desconhecida";
    }
}
