package com.client;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EntityProperties {
    SUPERIOR {
        @Override
        public void apply(Model model) {
            model.scale(150, 150, 150);
        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {

            }
        }
    },
    MINI {
        @Override
        public void apply(Model model) {
            model.scale(50, 50, 50);
        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {

            }
        }
    },
    SHADOW {
        @Override
        public void apply(Model model) {
            model.recolor(8);
        }

        @Override
        public void apply(Entity entity) {
        }
    },
    LUKE {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Luke";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    PROPHET {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Prophet";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    SPONGE {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Sponge";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    THE_GURU {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "The Guru";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    BBQ {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "BBQ";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    CEREDORIS {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Ceredoris";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    THRILL {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Thrill";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    THIRTEENTH_REASON {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "13th Reason";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    ADRIAN {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Adrian";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    BURNSY {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Burnsy";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    ALPHA {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Alpha";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    APARIGRAHA {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Aparigraha";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    HEIMDALL {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Heimdall";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },
    NOVACHRONO {
        @Override
        public void apply(Model model) {

        }

        @Override
        public void apply(Entity entity) {
            if(entity instanceof Npc) {
                ((Npc) entity).displayName = "Novachrono";
                ((Npc) entity).combatLevel = 126;
                ((Npc) entity).actions = new String[7];
                ((Npc) entity).actions[0] = "Follow";
                ((Npc) entity).actions[1] = "Trade With";
            }
        }
    },


    ;
    public abstract void apply(Model model);
    public abstract void apply(Entity entity);
}
