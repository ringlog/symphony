/*
 * Copyright (c) 2012-2015, b3log.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.symphony.model;

/**
 * This class defines all reward model relevant keys.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.1.0.0, Jun 27, 2015
 * @since 0.2.5
 */
public final class Reward {

    /**
     * Reward.
     */
    public static final String REWARD = "reward";

    /**
     * Rewards.
     */
    public static final String REWARDS = "rewards";

    /**
     * Key of sender id.
     */
    public static final String SENDER_ID = "senderId";

    /**
     * Key of data id.
     */
    public static final String DATA_ID = "dataId";

    /**
     * Key of type.
     */
    public static final String TYPE = "type";

    // Reward type constants
    /**
     * Reward type - article.
     */
    public static final int TYPE_C_ARTICLE = 0;

    /**
     * Reward type - comment.
     */
    public static final int TYPE_C_COMMENT = 1;

    /**
     * Reward type - user.
     */
    public static final int TYPE_C_USER = 2;

    /**
     * Private constructor.
     */
    private Reward() {
    }
}
