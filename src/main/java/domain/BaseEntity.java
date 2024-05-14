package domain;

import java.time.Instant;
import java.util.UUID;

public abstract class BaseEntity {

    private UUID id;
    private Instant createdAt;
    private Instant updatedAt;
}
