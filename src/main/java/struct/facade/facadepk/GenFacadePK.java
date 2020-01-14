package struct.facade.facadepk;

public class GenFacadePK {
    private LightsPK[] lightsPKS = new LightsPK[4];
    private TevelecPK tevelecPK;
    private AirPK airPK;


    public GenFacadePK() {
        lightsPKS[0] = new LightsPK("客厅");
        lightsPKS[1] = new LightsPK("厨房");
        lightsPKS[2] = new LightsPK("卫生间");
        lightsPKS[3] = new LightsPK("卧室");
        tevelecPK = new TevelecPK();
        airPK =new AirPK();
    }

    public void on() {
        for (LightsPK lpk:lightsPKS
             ) {
            lpk.on();
        }
        tevelecPK.on();
        airPK.on();
    }

    public void off() {
        for (LightsPK lpkd:lightsPKS
             ) {
            lpkd.off();

        }
        tevelecPK.off();
        airPK.off();

    }
}
