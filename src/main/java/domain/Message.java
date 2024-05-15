package domain;

import java.time.Instant;
import java.util.List;

public class Message {

    // not null
    private User sender;
    // not null
    private Instant timestamp;
    // not null
    private TextContent content;
    // max 8 entries
    private List<Media> attachments;
    // not null
    private Status status;
}
