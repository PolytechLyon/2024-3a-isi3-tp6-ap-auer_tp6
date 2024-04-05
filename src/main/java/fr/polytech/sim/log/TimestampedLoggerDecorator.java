package fr.polytech.sim.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampedLoggerDecorator implements Logger {
  private final Logger wrappedLogger;
  private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  public TimestampedLoggerDecorator(Logger logger) {
    this.wrappedLogger = logger;
  }

  @Override
  public void log(String format, Object... args) {
    String timestamp = dtf.format(LocalDateTime.now());
    String modifiedFormat = String.format("[%s] %s", timestamp, format);
    wrappedLogger.log(modifiedFormat, args);
  }
}
