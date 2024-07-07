package domain.model

import currencyapp.composeapp.generated.resources.Res
import currencyapp.composeapp.generated.resources.aed
import currencyapp.composeapp.generated.resources.afn
import currencyapp.composeapp.generated.resources.all
import currencyapp.composeapp.generated.resources.amd
import currencyapp.composeapp.generated.resources.ang
import currencyapp.composeapp.generated.resources.aoa
import currencyapp.composeapp.generated.resources.ars
import currencyapp.composeapp.generated.resources.aud
import currencyapp.composeapp.generated.resources.awg
import currencyapp.composeapp.generated.resources.azn
import currencyapp.composeapp.generated.resources.bam
import currencyapp.composeapp.generated.resources.bbd
import currencyapp.composeapp.generated.resources.bdt
import currencyapp.composeapp.generated.resources.bgn
import currencyapp.composeapp.generated.resources.bhd
import currencyapp.composeapp.generated.resources.bif
import currencyapp.composeapp.generated.resources.bmd
import currencyapp.composeapp.generated.resources.bnd
import currencyapp.composeapp.generated.resources.bob
import currencyapp.composeapp.generated.resources.brl
import currencyapp.composeapp.generated.resources.bsd
import currencyapp.composeapp.generated.resources.btn
import currencyapp.composeapp.generated.resources.bwp
import currencyapp.composeapp.generated.resources.byn
import currencyapp.composeapp.generated.resources.byr
import currencyapp.composeapp.generated.resources.bzd
import currencyapp.composeapp.generated.resources.cad
import currencyapp.composeapp.generated.resources.cdf
import currencyapp.composeapp.generated.resources.chf
import currencyapp.composeapp.generated.resources.clp
import currencyapp.composeapp.generated.resources.cny
import currencyapp.composeapp.generated.resources.cop
import currencyapp.composeapp.generated.resources.crc
import currencyapp.composeapp.generated.resources.cuc
import currencyapp.composeapp.generated.resources.cup
import currencyapp.composeapp.generated.resources.cve
import currencyapp.composeapp.generated.resources.czk
import currencyapp.composeapp.generated.resources.djf
import currencyapp.composeapp.generated.resources.dkk
import currencyapp.composeapp.generated.resources.dop
import currencyapp.composeapp.generated.resources.dzd
import currencyapp.composeapp.generated.resources.egp
import currencyapp.composeapp.generated.resources.ern
import currencyapp.composeapp.generated.resources.etb
import currencyapp.composeapp.generated.resources.eur
import currencyapp.composeapp.generated.resources.fjd
import currencyapp.composeapp.generated.resources.fkp
import currencyapp.composeapp.generated.resources.gbp
import currencyapp.composeapp.generated.resources.gel
import currencyapp.composeapp.generated.resources.ggp
import currencyapp.composeapp.generated.resources.ghs
import currencyapp.composeapp.generated.resources.gip
import currencyapp.composeapp.generated.resources.gmd
import currencyapp.composeapp.generated.resources.gnf
import currencyapp.composeapp.generated.resources.gtq
import currencyapp.composeapp.generated.resources.gyd
import currencyapp.composeapp.generated.resources.hkd
import currencyapp.composeapp.generated.resources.hnl
import currencyapp.composeapp.generated.resources.hrk
import currencyapp.composeapp.generated.resources.htg
import currencyapp.composeapp.generated.resources.huf
import currencyapp.composeapp.generated.resources.idr
import currencyapp.composeapp.generated.resources.ils
import currencyapp.composeapp.generated.resources.imp
import currencyapp.composeapp.generated.resources.inr
import currencyapp.composeapp.generated.resources.iqd
import currencyapp.composeapp.generated.resources.irr
import currencyapp.composeapp.generated.resources.isk
import currencyapp.composeapp.generated.resources.jep
import currencyapp.composeapp.generated.resources.jmd
import currencyapp.composeapp.generated.resources.jod
import currencyapp.composeapp.generated.resources.jpy
import currencyapp.composeapp.generated.resources.kes
import currencyapp.composeapp.generated.resources.kgs
import currencyapp.composeapp.generated.resources.khr
import currencyapp.composeapp.generated.resources.kmf
import currencyapp.composeapp.generated.resources.kpw
import currencyapp.composeapp.generated.resources.krw
import currencyapp.composeapp.generated.resources.kwd
import currencyapp.composeapp.generated.resources.kyd
import currencyapp.composeapp.generated.resources.kzt
import currencyapp.composeapp.generated.resources.lak
import currencyapp.composeapp.generated.resources.lbp
import currencyapp.composeapp.generated.resources.lkr
import currencyapp.composeapp.generated.resources.lrd
import currencyapp.composeapp.generated.resources.lsl
import currencyapp.composeapp.generated.resources.ltl
import currencyapp.composeapp.generated.resources.lvl
import currencyapp.composeapp.generated.resources.lyd
import currencyapp.composeapp.generated.resources.mad
import currencyapp.composeapp.generated.resources.mdl
import currencyapp.composeapp.generated.resources.mga
import currencyapp.composeapp.generated.resources.mkd
import currencyapp.composeapp.generated.resources.mmk
import currencyapp.composeapp.generated.resources.mnt
import currencyapp.composeapp.generated.resources.mop
import currencyapp.composeapp.generated.resources.mru
import currencyapp.composeapp.generated.resources.mur
import currencyapp.composeapp.generated.resources.mvr
import currencyapp.composeapp.generated.resources.mwk
import currencyapp.composeapp.generated.resources.mxn
import currencyapp.composeapp.generated.resources.myr
import currencyapp.composeapp.generated.resources.mzn
import currencyapp.composeapp.generated.resources.nad
import currencyapp.composeapp.generated.resources.ngn
import currencyapp.composeapp.generated.resources.nio
import currencyapp.composeapp.generated.resources.nok
import currencyapp.composeapp.generated.resources.npr
import currencyapp.composeapp.generated.resources.nzd
import currencyapp.composeapp.generated.resources.omr
import currencyapp.composeapp.generated.resources.pab
import currencyapp.composeapp.generated.resources.pen
import currencyapp.composeapp.generated.resources.pgk
import currencyapp.composeapp.generated.resources.php
import currencyapp.composeapp.generated.resources.pkr
import currencyapp.composeapp.generated.resources.pln
import currencyapp.composeapp.generated.resources.pyg
import currencyapp.composeapp.generated.resources.qar
import currencyapp.composeapp.generated.resources.ron
import currencyapp.composeapp.generated.resources.rsd
import currencyapp.composeapp.generated.resources.rub
import currencyapp.composeapp.generated.resources.rwf
import currencyapp.composeapp.generated.resources.sar
import currencyapp.composeapp.generated.resources.sbd
import currencyapp.composeapp.generated.resources.scr
import currencyapp.composeapp.generated.resources.sdg
import currencyapp.composeapp.generated.resources.sek
import currencyapp.composeapp.generated.resources.sgd
import currencyapp.composeapp.generated.resources.shp
import currencyapp.composeapp.generated.resources.sll
import currencyapp.composeapp.generated.resources.sos
import currencyapp.composeapp.generated.resources.srd
import currencyapp.composeapp.generated.resources.stn
import currencyapp.composeapp.generated.resources.svc
import currencyapp.composeapp.generated.resources.syp
import currencyapp.composeapp.generated.resources.szl
import currencyapp.composeapp.generated.resources.thb
import currencyapp.composeapp.generated.resources.tjs
import currencyapp.composeapp.generated.resources.tmt
import currencyapp.composeapp.generated.resources.tnd
import currencyapp.composeapp.generated.resources.top
import currencyapp.composeapp.generated.resources.try_currency
import currencyapp.composeapp.generated.resources.ttd
import currencyapp.composeapp.generated.resources.twd
import currencyapp.composeapp.generated.resources.tzs
import currencyapp.composeapp.generated.resources.uah
import currencyapp.composeapp.generated.resources.ugx
import currencyapp.composeapp.generated.resources.usd
import currencyapp.composeapp.generated.resources.uyu
import currencyapp.composeapp.generated.resources.uzs
import currencyapp.composeapp.generated.resources.vef
import currencyapp.composeapp.generated.resources.ves
import currencyapp.composeapp.generated.resources.vnd
import currencyapp.composeapp.generated.resources.vuv
import currencyapp.composeapp.generated.resources.wst
import currencyapp.composeapp.generated.resources.xaf
import currencyapp.composeapp.generated.resources.xag
import currencyapp.composeapp.generated.resources.xau
import currencyapp.composeapp.generated.resources.xcd
import currencyapp.composeapp.generated.resources.xdr
import currencyapp.composeapp.generated.resources.xof
import currencyapp.composeapp.generated.resources.xpf
import currencyapp.composeapp.generated.resources.yer
import currencyapp.composeapp.generated.resources.zar
import currencyapp.composeapp.generated.resources.zmk
import currencyapp.composeapp.generated.resources.zmw
import currencyapp.composeapp.generated.resources.zwl
import org.jetbrains.compose.resources.DrawableResource

enum class CurrencyCode(
    val country: String,
    val flag: DrawableResource
) {

    /* All commented classes are crypto currency */

    //    ADA("Cardano", Res.drawable.ada),
    AED("United Arab Emirates", Res.drawable.aed),
    AFN("Afghanistan", Res.drawable.afn),
    ALL("Albania", Res.drawable.all),
    AMD("Armenia", Res.drawable.amd),
    ANG("Netherlands Antilles", Res.drawable.ang),
    AOA("Angola", Res.drawable.aoa),
//    ARB("Arbitrum", Res.drawable.arb),
    ARS("Argentina", Res.drawable.ars),
    AUD("Australia", Res.drawable.aud),
//    AVAX("Avalanche", Res.drawable.avax),
    AWG("Aruba", Res.drawable.awg),
    AZN("Azerbaijan", Res.drawable.azn),
    BAM("Bosnia and Herzegovina", Res.drawable.bam),
    BBD("Barbados", Res.drawable.bbd),
    BDT("Bangladesh", Res.drawable.bdt),
    BGN("Bulgaria", Res.drawable.bgn),
    BHD("Bahrain", Res.drawable.bhd),
    BIF("Burundi", Res.drawable.bif),
    BMD("Bermuda", Res.drawable.bmd),
//    BNB("Binance Coin", Res.drawable.bnb),
    BND("Brunei", Res.drawable.bnd),
    BOB("Bolivia", Res.drawable.bob),
    BRL("Brazil", Res.drawable.brl),
    BSD("Bahamas", Res.drawable.bsd),
//    BTC("Bitcoin", Res.drawable.btc),
    BTN("Bhutan", Res.drawable.btn),
    BWP("Botswana", Res.drawable.bwp),
    BYN("Belarus", Res.drawable.byn),
    BYR("Belarus (old)", Res.drawable.byr),
    BZD("Belize", Res.drawable.bzd),
    CAD("Canada", Res.drawable.cad),
    CDF("Congo-Kinshasa", Res.drawable.cdf),
    CHF("Switzerland", Res.drawable.chf),
    CLP("Chile", Res.drawable.clp),
    CNY("China", Res.drawable.cny),
    COP("Colombia", Res.drawable.cop),
    CRC("Costa Rica", Res.drawable.crc),
    CUC("Cuba", Res.drawable.cuc),
    CUP("Cuba", Res.drawable.cup),
    CVE("Cape Verde", Res.drawable.cve),
    CZK("Czech Republic", Res.drawable.czk),
//    DAI("Dai", Res.drawable.dai),
    DJF("Djibouti", Res.drawable.djf),
    DKK("Denmark", Res.drawable.dkk),
    DOP("Dominican Republic", Res.drawable.dop),
//    DOT("Polkadot", Res.drawable.dot),
    DZD("Algeria", Res.drawable.dzd),
    EGP("Egypt", Res.drawable.egp),
    ERN("Eritrea", Res.drawable.ern),
    ETB("Ethiopia", Res.drawable.etb),
//    ETH("Ethereum", Res.drawable.eth),
    EUR("Euro", Res.drawable.eur),
    FJD("Fiji", Res.drawable.fjd),
    FKP("Falkland Islands", Res.drawable.fkp),
    GBP("United Kingdom", Res.drawable.gbp),
    GEL("Georgia", Res.drawable.gel),
    GGP("Guernsey", Res.drawable.ggp),
    GHS("Ghana", Res.drawable.ghs),
    GIP("Gibraltar", Res.drawable.gip),
    GMD("Gambia", Res.drawable.gmd),
    GNF("Guinea", Res.drawable.gnf),
    GTQ("Guatemala", Res.drawable.gtq),
    GYD("Guyana", Res.drawable.gyd),
    HKD("Hong Kong", Res.drawable.hkd),
    HNL("Honduras", Res.drawable.hnl),
    HRK("Croatia", Res.drawable.hrk),
    HTG("Haiti", Res.drawable.htg),
    HUF("Hungary", Res.drawable.huf),
    IDR("Indonesia", Res.drawable.idr),
    ILS("Israel", Res.drawable.ils),
    IMP("Isle of Man", Res.drawable.imp),
    INR("India", Res.drawable.inr),
    IQD("Iraq", Res.drawable.iqd),
    IRR("Iran", Res.drawable.irr),
    ISK("Iceland", Res.drawable.isk),
    JEP("Jersey", Res.drawable.jep),
    JMD("Jamaica", Res.drawable.jmd),
    JOD("Jordan", Res.drawable.jod),
    JPY("Japan", Res.drawable.jpy),
    KES("Kenya", Res.drawable.kes),
    KGS("Kyrgyzstan", Res.drawable.kgs),
    KHR("Cambodia", Res.drawable.khr),
    KMF("Comoros", Res.drawable.kmf),
    KPW("North Korea", Res.drawable.kpw),
    KRW("South Korea", Res.drawable.krw),
    KWD("Kuwait", Res.drawable.kwd),
    KYD("Cayman Islands", Res.drawable.kyd),
    KZT("Kazakhstan", Res.drawable.kzt),
    LAK("Laos", Res.drawable.lak),
    LBP("Lebanon", Res.drawable.lbp),
    LKR("Sri Lanka", Res.drawable.lkr),
    LRD("Liberia", Res.drawable.lrd),
    LSL("Lesotho", Res.drawable.lsl),
//    LTC("Litecoin", Res.drawable.ltc),
    LTL("Lithuania", Res.drawable.ltl),
    LVL("Latvia", Res.drawable.lvl),
    LYD("Libya", Res.drawable.lyd),
    MAD("Morocco", Res.drawable.mad),
//    MATIC("Polygon", Res.drawable.matic),
    MDL("Moldova", Res.drawable.mdl),
    MGA("Madagascar", Res.drawable.mga),
    MKD("North Macedonia", Res.drawable.mkd),
    MMK("Myanmar", Res.drawable.mmk),
    MNT("Mongolia", Res.drawable.mnt),
    MOP("Macau", Res.drawable.mop),
    MRU("Mauritania", Res.drawable.mru),
    MUR("Mauritius", Res.drawable.mur),
    MVR("Maldives", Res.drawable.mvr),
    MWK("Malawi", Res.drawable.mwk),
    MXN("Mexico", Res.drawable.mxn),
    MYR("Malaysia", Res.drawable.myr),
    MZN("Mozambique", Res.drawable.mzn),
    NAD("Namibia", Res.drawable.nad),
    NGN("Nigeria", Res.drawable.ngn),
    NIO("Nicaragua", Res.drawable.nio),
    NOK("Norway", Res.drawable.nok),
    NPR("Nepal", Res.drawable.npr),
    NZD("New Zealand", Res.drawable.nzd),
    OMR("Oman", Res.drawable.omr),
//    OP("Optimism", Res.drawable.op),
    PAB("Panama", Res.drawable.pab),
    PEN("Peru", Res.drawable.pen),
    PGK("Papua New Guinea", Res.drawable.pgk),
    PHP("Philippines", Res.drawable.php),
    PKR("Pakistan", Res.drawable.pkr),
    PLN("Poland", Res.drawable.pln),
    PYG("Paraguay", Res.drawable.pyg),
    QAR("Qatar", Res.drawable.qar),
    RON("Romania", Res.drawable.ron),
    RSD("Serbia", Res.drawable.rsd),
    RUB("Russia", Res.drawable.rub),
    RWF("Rwanda", Res.drawable.rwf),
    SAR("Saudi Arabia", Res.drawable.sar),
    SBD("Solomon Islands", Res.drawable.sbd),
    SCR("Seychelles", Res.drawable.scr),
    SDG("Sudan", Res.drawable.sdg),
    SEK("Sweden", Res.drawable.sek),
    SGD("Singapore", Res.drawable.sgd),
    SHP("Saint Helena", Res.drawable.shp),
    SLL("Sierra Leone", Res.drawable.sll),
//    SOL("Solana", Res.drawable.sol),
    SOS("Somalia", Res.drawable.sos),
    SRD("Suriname", Res.drawable.srd),
    STN("Sao Tome and Principe", Res.drawable.stn),
    SVC("El Salvador", Res.drawable.svc),
    SYP("Syria", Res.drawable.syp),
    SZL("Eswatini", Res.drawable.szl),
    THB("Thailand", Res.drawable.thb),
    TJS("Tajikistan", Res.drawable.tjs),
    TMT("Turkmenistan", Res.drawable.tmt),
    TND("Tunisia", Res.drawable.tnd),
    TOP("Tonga", Res.drawable.top),
    TRY("Turkey", Res.drawable.try_currency),
    TTD("Trinidad and Tobago", Res.drawable.ttd),
    TWD("Taiwan", Res.drawable.twd),
    TZS("Tanzania", Res.drawable.tzs),
    UAH("Ukraine", Res.drawable.uah),
    UGX("Uganda", Res.drawable.ugx),
    USD("United States", Res.drawable.usd),
//    USDC("USD Coin", Res.drawable.usdc),
//    USDT("Tether", Res.drawable.usdt),
    UYU("Uruguay", Res.drawable.uyu),
    UZS("Uzbekistan", Res.drawable.uzs),
    VEF("Venezuela (Old)", Res.drawable.vef),
    VES("Venezuela", Res.drawable.ves),
    VND("Vietnam", Res.drawable.vnd),
    VUV("Vanuatu", Res.drawable.vuv),
    WST("Samoa", Res.drawable.wst),
    XAF("Central African CFA Franc", Res.drawable.xaf),
    XAG("Silver Ounce", Res.drawable.xag),
    XAU("Gold Ounce", Res.drawable.xau),
    XCD("East Caribbean Dollar", Res.drawable.xcd),
    XDR("Special Drawing Rights", Res.drawable.xdr),
    XOF("West African CFA Franc", Res.drawable.xof),
//    XPD("Palladium Ounce", Res.drawable.xpd),
    XPF("CFP Franc", Res.drawable.xpf),
//    XPT("Platinum Ounce", Res.drawable.xpt),
//    XRP("Ripple", Res.drawable.xrp),
    YER("Yemen", Res.drawable.yer),
    ZAR("South Africa", Res.drawable.zar),
    ZMK("Zambia (Old)", Res.drawable.zmk),
    ZMW("Zambia", Res.drawable.zmw),
    ZWL("Zimbabwe", Res.drawable.zwl)

}