/**
 * This class is generated by jOOQ
 */
package com.example.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_E2C19DC8_2C61_49A8_A9A2_DD1EEDAEA8B7</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_E2C19DC8_2C61_49A8_A9A2_DD1EEDAEA8B7 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_E2C19DC8_2C61_49A8_A9A2_DD1EEDAEA8B7", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_E85096E6_C230_469A_9715_808E7A54E483</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_E85096E6_C230_469A_9715_808E7A54E483 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_E85096E6_C230_469A_9715_808E7A54E483", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
