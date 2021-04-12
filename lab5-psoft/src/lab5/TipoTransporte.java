package lab5;

import lab5.transporte.*;

public enum TipoTransporte {
    PEDESTRE{
        @Override
        public Transporte getTipoTransporte() {
            return new Pedestre();
        }
    },
    CARRO {
        @Override
        public Transporte getTipoTransporte() {
            return new Carro();
        }
    },

    MOTO {
        @Override
        public Transporte getTipoTransporte() {
            return new Moto();
        }
    },
    ONIBUS {
        @Override
        public Transporte getTipoTransporte() {
            return new Onibus();
        }
    },
    METRO {
        @Override
        public Transporte getTipoTransporte() {
            return new Metro();
        }
    };

    public abstract Transporte getTipoTransporte();
}
