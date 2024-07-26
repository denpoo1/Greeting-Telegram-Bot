/**
 * Created by Denys Durbalov
 * Date of creation: 7/26/24
 * Project name: greeting_telegram_bot
 * email: den.dyrbalov25@gmail.com or s28680@pjwstk.edu.pl
 */

package com.denpool.greeting_telegram_bot.event_handler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GreetingParams {
        private String title;
        private String openingLine;
        private String mainBody;
        private String closingLine;
        private String signature;
}
