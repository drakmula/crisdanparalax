package com.producao.crisdan;

public enum TamanhoTela {
	GRANDE {
        @Override
        public String pixels() {
            return "415 x 205";
        }
    },
    MEDIA {
        @Override
        public String pixels() {
            return "630 x 410";
        }
    },
    PEQUENA {
        @Override
        public String pixels() {
            return "840 x 620";
        }
    };
 
    public abstract String pixels();
}
