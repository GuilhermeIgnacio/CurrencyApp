package domain.model

import currencyapp.composeapp.generated.resources.Res
import currencyapp.composeapp.generated.resources.ae
import currencyapp.composeapp.generated.resources.af
import currencyapp.composeapp.generated.resources.al
import currencyapp.composeapp.generated.resources.am
import currencyapp.composeapp.generated.resources.an
import currencyapp.composeapp.generated.resources.ao
import currencyapp.composeapp.generated.resources.ar
import currencyapp.composeapp.generated.resources.au
import currencyapp.composeapp.generated.resources.aw
import currencyapp.composeapp.generated.resources.az
import currencyapp.composeapp.generated.resources.ba
import currencyapp.composeapp.generated.resources.bb
import currencyapp.composeapp.generated.resources.bd
import currencyapp.composeapp.generated.resources.bg
import currencyapp.composeapp.generated.resources.bh
import currencyapp.composeapp.generated.resources.bi
import currencyapp.composeapp.generated.resources.bm
import currencyapp.composeapp.generated.resources.bn
import currencyapp.composeapp.generated.resources.bo
import currencyapp.composeapp.generated.resources.br
import currencyapp.composeapp.generated.resources.bs
import currencyapp.composeapp.generated.resources.bt
import currencyapp.composeapp.generated.resources.bw
import currencyapp.composeapp.generated.resources.by
import currencyapp.composeapp.generated.resources.bz
import currencyapp.composeapp.generated.resources.ca
import currencyapp.composeapp.generated.resources.cd
import currencyapp.composeapp.generated.resources.ch
import currencyapp.composeapp.generated.resources.cl
import currencyapp.composeapp.generated.resources.cn
import currencyapp.composeapp.generated.resources.co
import currencyapp.composeapp.generated.resources.cr
import currencyapp.composeapp.generated.resources.cu
import currencyapp.composeapp.generated.resources.cv
import currencyapp.composeapp.generated.resources.cz
import currencyapp.composeapp.generated.resources.dj
import currencyapp.composeapp.generated.resources.dk
import currencyapp.composeapp.generated.resources.dominican
import currencyapp.composeapp.generated.resources.dz
import currencyapp.composeapp.generated.resources.eg
import currencyapp.composeapp.generated.resources.er
import currencyapp.composeapp.generated.resources.et
import currencyapp.composeapp.generated.resources.eu
import currencyapp.composeapp.generated.resources.fj
import currencyapp.composeapp.generated.resources.fk
import currencyapp.composeapp.generated.resources.gb
import currencyapp.composeapp.generated.resources.ge
import currencyapp.composeapp.generated.resources.gg
import currencyapp.composeapp.generated.resources.gh
import currencyapp.composeapp.generated.resources.gi
import currencyapp.composeapp.generated.resources.gm
import currencyapp.composeapp.generated.resources.gn
import currencyapp.composeapp.generated.resources.gt
import currencyapp.composeapp.generated.resources.gy
import currencyapp.composeapp.generated.resources.hk
import currencyapp.composeapp.generated.resources.hn
import currencyapp.composeapp.generated.resources.hr
import currencyapp.composeapp.generated.resources.ht
import currencyapp.composeapp.generated.resources.hu
import currencyapp.composeapp.generated.resources.id
import currencyapp.composeapp.generated.resources.il
import currencyapp.composeapp.generated.resources.im
import currencyapp.composeapp.generated.resources.in_currency
import currencyapp.composeapp.generated.resources.iq
import currencyapp.composeapp.generated.resources.ir
import currencyapp.composeapp.generated.resources.is_currency
import currencyapp.composeapp.generated.resources.je
import currencyapp.composeapp.generated.resources.jm
import currencyapp.composeapp.generated.resources.jo
import currencyapp.composeapp.generated.resources.jp
import currencyapp.composeapp.generated.resources.ke
import currencyapp.composeapp.generated.resources.kg
import currencyapp.composeapp.generated.resources.kh
import currencyapp.composeapp.generated.resources.km
import currencyapp.composeapp.generated.resources.kp
import currencyapp.composeapp.generated.resources.kr
import currencyapp.composeapp.generated.resources.kw
import currencyapp.composeapp.generated.resources.ky
import currencyapp.composeapp.generated.resources.kz
import currencyapp.composeapp.generated.resources.la
import currencyapp.composeapp.generated.resources.lb
import currencyapp.composeapp.generated.resources.lk
import currencyapp.composeapp.generated.resources.lr
import currencyapp.composeapp.generated.resources.ls
import currencyapp.composeapp.generated.resources.lt
import currencyapp.composeapp.generated.resources.lv
import currencyapp.composeapp.generated.resources.ly
import currencyapp.composeapp.generated.resources.ma
import currencyapp.composeapp.generated.resources.md
import currencyapp.composeapp.generated.resources.mg
import currencyapp.composeapp.generated.resources.mk
import currencyapp.composeapp.generated.resources.mm
import currencyapp.composeapp.generated.resources.mn
import currencyapp.composeapp.generated.resources.mo
import currencyapp.composeapp.generated.resources.mr
import currencyapp.composeapp.generated.resources.mu
import currencyapp.composeapp.generated.resources.mv
import currencyapp.composeapp.generated.resources.mw
import currencyapp.composeapp.generated.resources.mx
import currencyapp.composeapp.generated.resources.my
import currencyapp.composeapp.generated.resources.mz
import currencyapp.composeapp.generated.resources.na
import currencyapp.composeapp.generated.resources.ng
import currencyapp.composeapp.generated.resources.ni
import currencyapp.composeapp.generated.resources.no
import currencyapp.composeapp.generated.resources.np
import currencyapp.composeapp.generated.resources.nz
import currencyapp.composeapp.generated.resources.om
import currencyapp.composeapp.generated.resources.pa
import currencyapp.composeapp.generated.resources.pe
import currencyapp.composeapp.generated.resources.pg
import currencyapp.composeapp.generated.resources.ph
import currencyapp.composeapp.generated.resources.pk
import currencyapp.composeapp.generated.resources.pl
import currencyapp.composeapp.generated.resources.py
import currencyapp.composeapp.generated.resources.qa
import currencyapp.composeapp.generated.resources.ro
import currencyapp.composeapp.generated.resources.rs
import currencyapp.composeapp.generated.resources.ru
import currencyapp.composeapp.generated.resources.rw
import currencyapp.composeapp.generated.resources.sa
import currencyapp.composeapp.generated.resources.sb
import currencyapp.composeapp.generated.resources.sc
import currencyapp.composeapp.generated.resources.sd
import currencyapp.composeapp.generated.resources.se
import currencyapp.composeapp.generated.resources.sg
import currencyapp.composeapp.generated.resources.sh
import currencyapp.composeapp.generated.resources.sl
import currencyapp.composeapp.generated.resources.so
import currencyapp.composeapp.generated.resources.sr
import currencyapp.composeapp.generated.resources.st
import currencyapp.composeapp.generated.resources.sv
import currencyapp.composeapp.generated.resources.sy
import currencyapp.composeapp.generated.resources.sz
import currencyapp.composeapp.generated.resources.th
import currencyapp.composeapp.generated.resources.tj
import currencyapp.composeapp.generated.resources.tm
import currencyapp.composeapp.generated.resources.tn
import currencyapp.composeapp.generated.resources.to_currency
import currencyapp.composeapp.generated.resources.tr
import currencyapp.composeapp.generated.resources.tt
import currencyapp.composeapp.generated.resources.tw
import currencyapp.composeapp.generated.resources.tz
import currencyapp.composeapp.generated.resources.ua
import currencyapp.composeapp.generated.resources.ug
import currencyapp.composeapp.generated.resources.us
import currencyapp.composeapp.generated.resources.uy
import currencyapp.composeapp.generated.resources.uz
import currencyapp.composeapp.generated.resources.ve
import currencyapp.composeapp.generated.resources.vn
import currencyapp.composeapp.generated.resources.vu
import currencyapp.composeapp.generated.resources.ws
import currencyapp.composeapp.generated.resources.xk
import currencyapp.composeapp.generated.resources.ye
import currencyapp.composeapp.generated.resources.za
import currencyapp.composeapp.generated.resources.zm
import currencyapp.composeapp.generated.resources.zw
import org.jetbrains.compose.resources.DrawableResource

enum class CurrencyCode(
    val country: String,
    val flag: DrawableResource
) {

    /* All commented classes are crypto currency */

//        ADA("Cardano", Res.drawable.ada),
//        ARB("Arbitrum", Res.drawable.arb),
//        AVAX("Avalanche", Res.drawable.avax),
//        BNB("Binance Coin", Res.drawable.bnb),
//        BTC("Bitcoin", Res.drawable.btc),
//        DAI("Dai", Res.drawable.dai),
//        DOT("Polkadot", Res.drawable.dot),
//        ETH("Ethereum", Res.drawable.eth),
//        LTC("Litecoin", Res.drawable.ltc),
//        MATIC("Polygon", Res.drawable.matic),
//        OP("Optimism", Res.drawable.op),
//        SOL("Solana", Res.drawable.sol),
//        USDC("USD Coin", Res.drawable.usdc),
//        USDT("Tether", Res.drawable.usdt),
//        XPD("Palladium Ounce", Res.drawable.xpd),
//        XPT("Platinum Ounce", Res.drawable.xpt),
//        XRP("Ripple", Res.drawable.xrp),


    AED("United Arab Emirates", Res.drawable.ae),
    AFN("Afghanistan", Res.drawable.af),
    ALL("Albania", Res.drawable.al),
    AMD("Armenia", Res.drawable.am),
    ANG("Netherlands Antilles", Res.drawable.an),
    AOA("Angola", Res.drawable.ao),
    ARS("Argentina", Res.drawable.ar),
    AUD("Australia", Res.drawable.au),
    AWG("Aruba", Res.drawable.aw),
    AZN("Azerbaijan", Res.drawable.az),
    BAM("Bosnia and Herzegovina", Res.drawable.ba),
    BBD("Barbados", Res.drawable.bb),
    BDT("Bangladesh", Res.drawable.bd),
    BGN("Bulgaria", Res.drawable.bg),
    BHD("Bahrain", Res.drawable.bh),
    BIF("Burundi", Res.drawable.bi),
    BMD("Bermuda", Res.drawable.bm),
    BND("Brunei", Res.drawable.bn),
    BOB("Bolivia", Res.drawable.bo),
    BRL("Brazil", Res.drawable.br),
    BSD("Bahamas", Res.drawable.bs),
    BTN("Bhutan", Res.drawable.bt),
    BWP("Botswana", Res.drawable.bw),
    BYN("Belarus", Res.drawable.by),
    BYR("Belarus (old)", Res.drawable.by),
    BZD("Belize", Res.drawable.bz),
    CAD("Canada", Res.drawable.ca),
    CDF("Congo-Kinshasa", Res.drawable.cd),
    CHF("Switzerland", Res.drawable.ch),
    CLP("Chile", Res.drawable.cl),
    CNY("China", Res.drawable.cn),
    COP("Colombia", Res.drawable.co),
    CRC("Costa Rica", Res.drawable.cr),
    CUC("Cuba", Res.drawable.cu),
    CUP("Cuba", Res.drawable.cu),
    CVE("Cape Verde", Res.drawable.cv),
    CZK("Czech Republic", Res.drawable.cz),
    DJF("Djibouti", Res.drawable.dj),
    DKK("Denmark", Res.drawable.dk),
    DOP("Dominican Republic", Res.drawable.dominican),
    DZD("Algeria", Res.drawable.dz),
    EGP("Egypt", Res.drawable.eg),
    ERN("Eritrea", Res.drawable.er),
    ETB("Ethiopia", Res.drawable.et),
    EUR("Euro", Res.drawable.eu),
    FJD("Fiji", Res.drawable.fj),
    FKP("Falkland Islands", Res.drawable.fk),
    GBP("United Kingdom", Res.drawable.gb),
    GEL("Georgia", Res.drawable.ge),
    GGP("Guernsey", Res.drawable.gg),
    GHS("Ghana", Res.drawable.gh),
    GIP("Gibraltar", Res.drawable.gi),
    GMD("Gambia", Res.drawable.gm),
    GNF("Guinea", Res.drawable.gn),
    GTQ("Guatemala", Res.drawable.gt),
    GYD("Guyana", Res.drawable.gy),
    HKD("Hong Kong", Res.drawable.hk),
    HNL("Honduras", Res.drawable.hn),
    HRK("Croatia", Res.drawable.hr),
    HTG("Haiti", Res.drawable.ht),
    HUF("Hungary", Res.drawable.hu),
    IDR("Indonesia", Res.drawable.id),
    ILS("Israel", Res.drawable.il),
    IMP("Isle of Man", Res.drawable.im),
    INR("India", Res.drawable.in_currency),
    IQD("Iraq", Res.drawable.iq),
    IRR("Iran", Res.drawable.ir),
    ISK("Iceland", Res.drawable.is_currency),
    JEP("Jersey", Res.drawable.je),
    JMD("Jamaica", Res.drawable.jm),
    JOD("Jordan", Res.drawable.jo),
    JPY("Japan", Res.drawable.jp),
    KES("Kenya", Res.drawable.ke),
    KGS("Kyrgyzstan", Res.drawable.kg),
    KHR("Cambodia", Res.drawable.kh),
    KMF("Comoros", Res.drawable.km),
    KPW("North Korea", Res.drawable.kp),
    KRW("South Korea", Res.drawable.kr),
    KWD("Kuwait", Res.drawable.kw),
    KYD("Cayman Islands", Res.drawable.ky),
    KZT("Kazakhstan", Res.drawable.kz),
    LAK("Laos", Res.drawable.la),
    LBP("Lebanon", Res.drawable.lb),
    LKR("Sri Lanka", Res.drawable.lk),
    LRD("Liberia", Res.drawable.lr),
    LSL("Lesotho", Res.drawable.ls),
    LTL("Lithuania", Res.drawable.lt),
    LVL("Latvia", Res.drawable.lv),
    LYD("Libya", Res.drawable.ly),
    MAD("Morocco", Res.drawable.ma),
    MDL("Moldova", Res.drawable.md),
    MGA("Madagascar", Res.drawable.mg),
    MKD("North Macedonia", Res.drawable.mk),
    MMK("Myanmar", Res.drawable.mm),
    MNT("Mongolia", Res.drawable.mn),
    MOP("Macau", Res.drawable.mo),
    MRU("Mauritania", Res.drawable.mr),
    MUR("Mauritius", Res.drawable.mu),
    MVR("Maldives", Res.drawable.mv),
    MWK("Malawi", Res.drawable.mw),
    MXN("Mexico", Res.drawable.mx),
    MYR("Malaysia", Res.drawable.my),
    MZN("Mozambique", Res.drawable.mz),
    NAD("Namibia", Res.drawable.na),
    NGN("Nigeria", Res.drawable.ng),
    NIO("Nicaragua", Res.drawable.ni),
    NOK("Norway", Res.drawable.no),
    NPR("Nepal", Res.drawable.np),
    NZD("New Zealand", Res.drawable.nz),
    OMR("Oman", Res.drawable.om),
    PAB("Panama", Res.drawable.pa),
    PEN("Peru", Res.drawable.pe),
    PGK("Papua New Guinea", Res.drawable.pg),
    PHP("Philippines", Res.drawable.ph),
    PKR("Pakistan", Res.drawable.pk),
    PLN("Poland", Res.drawable.pl),
    PYG("Paraguay", Res.drawable.py),
    QAR("Qatar", Res.drawable.qa),
    RON("Romania", Res.drawable.ro),
    RSD("Serbia", Res.drawable.rs),
    RUB("Russia", Res.drawable.ru),
    RWF("Rwanda", Res.drawable.rw),
    SAR("Saudi Arabia", Res.drawable.sa),
    SBD("Solomon Islands", Res.drawable.sb),
    SCR("Seychelles", Res.drawable.sc),
    SDG("Sudan", Res.drawable.sd),
    SEK("Sweden", Res.drawable.se),
    SGD("Singapore", Res.drawable.sg),
    SHP("Saint Helena", Res.drawable.sh),
    SLL("Sierra Leone", Res.drawable.sl),
    SOS("Somalia", Res.drawable.so),
    SRD("Suriname", Res.drawable.sr),
    STN("Sao Tome and Principe", Res.drawable.st),
    SVC("El Salvador", Res.drawable.sv),
    SYP("Syria", Res.drawable.sy),
    SZL("Eswatini", Res.drawable.sz),
    THB("Thailand", Res.drawable.th),
    TJS("Tajikistan", Res.drawable.tj),
    TMT("Turkmenistan", Res.drawable.tm),
    TND("Tunisia", Res.drawable.tn),
    TOP("Tonga", Res.drawable.to_currency),
    TRY("Turkey", Res.drawable.tr),
    TTD("Trinidad and Tobago", Res.drawable.tt),
    TWD("Taiwan", Res.drawable.tw),
    TZS("Tanzania", Res.drawable.tz),
    UAH("Ukraine", Res.drawable.ua),
    UGX("Uganda", Res.drawable.ug),
    USD("United States", Res.drawable.us),
    UYU("Uruguay", Res.drawable.uy),
    UZS("Uzbekistan", Res.drawable.uz),
    VEF("Venezuela (Old)", Res.drawable.ve),
    VES("Venezuela", Res.drawable.ve),
    VND("Vietnam", Res.drawable.vn),
    VUV("Vanuatu", Res.drawable.vu),
    WST("Samoa", Res.drawable.ws),
    XAF("Central African CFA Franc", Res.drawable.xk),

    /* Todo: Add these countries flags
    XAG("Silver Ounce", Res.drawable.xag),
    XAU("Gold Ounce", Res.drawable.xau),
    XCD("East Caribbean Dollar", Res.drawable.xcd),
    XDR("Special Drawing Rights", Res.drawable.xdr),
    XOF("West African CFA Franc", Res.drawable.xof),
    XPF("CFP Franc", Res.drawable.xpf),
    */

    YER("Yemen", Res.drawable.ye),
    ZAR("South Africa", Res.drawable.za),
    ZMK("Zambia (Old)", Res.drawable.zm),
    ZMW("Zambia", Res.drawable.zm),
    ZWL("Zimbabwe", Res.drawable.zw)


}