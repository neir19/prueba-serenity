package com.prueba.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElementVisible implements Question<Boolean> {

        private final Target target;

        public ElementVisible(Target target) {
            this.target = target;
        }

        public static ElementVisible of(Target target) {
            return new ElementVisible(target);
        }

        @Override
        public Boolean answeredBy(Actor actor) {
            return target.resolveFor(actor).isVisible();
        }


}

