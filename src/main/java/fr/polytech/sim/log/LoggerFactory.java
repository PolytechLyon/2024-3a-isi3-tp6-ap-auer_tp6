package fr.polytech.sim.log;

public class LoggerFactory {

  public static Logger getLogger(String name) {
    // Choix du type de Logger ici. Par exemple, ConsoleLogger:
    return new ConsoleLogger(name);
  }
}
