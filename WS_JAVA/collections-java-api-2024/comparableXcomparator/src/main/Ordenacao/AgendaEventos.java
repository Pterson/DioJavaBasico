package main.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        //eventosMap.put(data, evento);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        //Set<LocalDate> dateSet = eventosMap.keySet();
        //Collection<Evento> values = eventosMap.values();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximadata = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximadata = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximadata);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 04), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.JANUARY, 10), "Evento 3", "Atração 3");

        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
        agendaEventos.exibirAgenda();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("");

        System.out.println("-------------------------- PROXIMOS EVENTOS --------------------------");
        agendaEventos.obterProximoEvento();
        //System.out.println(LocalDate.now());        
        System.out.println("----------------------------------------------------------------------");
        System.out.println("");
    }
    
}
