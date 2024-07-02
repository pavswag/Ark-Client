package com.client;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EntityProperties {
    SUPERIOR {
        @Override
        public void apply(Model model) {
            model.scale(150, 150, 150);
        }
    },
    MINI {
        @Override
        public void apply(Model model) {
            model.scale(50, 50, 50);
        }
    },
    SHADOW {
        @Override
        public void apply(Model model) {
            model.recolor(8);
        }
    }
    ;
    public abstract void apply(Model model);
}
