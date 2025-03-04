package SetUsersExercise.src.entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {
    private String user;
    private Instant entryTime;

    public LogEntry(String user, Instant entryTime) {
        this.entryTime = entryTime;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Instant getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Instant entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(user, logEntry.user);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(user);
    }
}
