package org.example.core.model

import org.example.core.style.Modifier

abstract class BodyTag(name: String) : TagWithText(name) {
    fun b(modifier: Modifier = Modifier.Default, init: B.() -> Unit){
        val b = initTag(B(), init)
        b.applyModifier(modifier)
    }
    fun p(modifier: Modifier = Modifier.Default, init: P.() -> Unit){
        val p = initTag(P(), init)
        p.applyModifier(modifier)
    }
    fun h1(modifier: Modifier = Modifier.Default, init: H1.() -> Unit){
        val h1 = initTag(H1(), init)
        h1.applyModifier(modifier)
    }
    fun h2(modifier: Modifier = Modifier.Default, init: H2.() -> Unit){
        val h2 = initTag(H2(), init)
        h2.applyModifier(modifier)
    }
    fun h3(modifier: Modifier = Modifier.Default, init: H3.() -> Unit) {
        val h3 = initTag(H3(), init)
        h3.applyModifier(modifier)
    }
    fun h4(modifier: Modifier = Modifier.Default, init: H4.() -> Unit) {
        val h4 = initTag(H4(), init)
        h4.applyModifier(modifier)
    }
    fun h5(modifier: Modifier = Modifier.Default,init: H5.() -> Unit) {
        val h5 = initTag(H5(), init)
        h5.applyModifier(modifier)
    }
    fun h6(modifier: Modifier = Modifier.Default,init: H6.() -> Unit) {
        val h6 = initTag(H6(), init)
        h6.applyModifier(modifier)
    }
    fun header(modifier: Modifier = Modifier.Default,init: Header.() -> Unit) {
        val header = initTag(Header(), init)
        header.applyModifier(modifier)
    }
    fun a(modifier: Modifier = Modifier.Default, href: String, init: A.() -> Unit) {
        val a = initTag(A(), init)
        a.href = href
        a.applyModifier(modifier)
    }
    fun abbr(modifier: Modifier = Modifier.Default, init: Abbr.() -> Unit) {
        val abbr = initTag(Abbr(), init)
        abbr.applyModifier(modifier)
    }

    fun acronym(modifier: Modifier = Modifier.Default, init: Acronym.() -> Unit) {
        val acronym = initTag(Acronym(), init)
        acronym.applyModifier(modifier)
    }

    fun address(modifier: Modifier = Modifier.Default, init: Address.() -> Unit) {
        val address = initTag(Address(), init)
        address.applyModifier(modifier)
    }
    fun applet(modifier: Modifier = Modifier.Default, init: Applet.() -> Unit) {
        val applet = initTag(Applet(), init)
        applet.applyModifier(modifier)
    }
    fun area(modifier: Modifier = Modifier.Default, init: Area.() -> Unit) {
        val area = initTag(Area(), init)
        area.applyModifier(modifier)
    }
    fun article(modifier: Modifier = Modifier.Default, init: Article.() -> Unit) {
        val article = initTag(Article(), init)
        article.applyModifier(modifier)
    }
    fun aside(modifier: Modifier = Modifier.Default, init: Aside.() -> Unit) {
        val aside = initTag(Aside(), init)
        aside.applyModifier(modifier)
    }
    fun audio(modifier: Modifier = Modifier.Default, init: Audio.() -> Unit) {
        val audio = initTag(Audio(), init)
        audio.applyModifier(modifier)
    }
    fun bdi(modifier: Modifier = Modifier.Default, init: Bdi.() -> Unit) {
        val bdi = initTag(Bdi(), init)
        bdi.applyModifier(modifier)
    }
    fun bdo(modifier: Modifier = Modifier.Default, init: Bdo.() -> Unit) {
        val bdo = initTag(Bdo(), init)
        bdo.applyModifier(modifier)
    }
    fun big(modifier: Modifier = Modifier.Default, init: Big.() -> Unit) {
        val big = initTag(Big(), init)
        big.applyModifier(modifier)
    }
    fun blink(modifier: Modifier = Modifier.Default, init: Blink.() -> Unit) {
        val blink = initTag(Blink(), init)
        blink.applyModifier(modifier)
    }
    fun blockquote(modifier: Modifier = Modifier.Default, init: BlockQuote.() -> Unit) {
        val blockquote = initTag(BlockQuote(), init)
        blockquote.applyModifier(modifier)
    }
    fun br(modifier: Modifier = Modifier.Default, init: Br.() -> Unit) {
        val br = initTag(Br(), init)
        br.applyModifier(modifier)
    }
    fun button(modifier: Modifier = Modifier.Default, init: Button.() -> Unit) {
        val button = initTag(Button(), init)
        button.applyModifier(modifier)
    }
    fun canvas(modifier: Modifier = Modifier.Default, init: Canvas.() -> Unit) {
        val canvas = initTag(Canvas(), init)
        canvas.applyModifier(modifier)
    }
    fun caption(modifier: Modifier = Modifier.Default, init: Caption.() -> Unit) {
        val caption = initTag(Caption(), init)
        caption.applyModifier(modifier)
    }
    fun center(modifier: Modifier = Modifier.Default, init: Center.() -> Unit) {
        val center = initTag(Center(), init)
        center.applyModifier(modifier)
    }
    fun cite(modifier: Modifier = Modifier.Default, init: Cite.() -> Unit) {
        val cite = initTag(Cite(), init)
        cite.applyModifier(modifier)
    }
    fun code(modifier: Modifier = Modifier.Default, init: Code.() -> Unit) {
        val code = initTag(Code(), init)
        code.applyModifier(modifier)
    }
    fun col(modifier: Modifier = Modifier.Default, init: Col.() -> Unit) {
        val col = initTag(Col(), init)
        col.applyModifier(modifier)
    }
    fun colgroup(modifier: Modifier = Modifier.Default, init: ColGroup.() -> Unit) {
        val colgroup = initTag(ColGroup(), init)
        colgroup.applyModifier(modifier)
    }
    fun command(modifier: Modifier = Modifier.Default, init: Command.() -> Unit) {
        val command = initTag(Command(), init)
        command.applyModifier(modifier)
    }
    fun comment(modifier: Modifier = Modifier.Default, init: Comment.() -> Unit) {
        val comment = initTag(Comment(), init)
        comment.applyModifier(modifier)
    }
    fun datalist(modifier: Modifier = Modifier.Default, init: DataList.() -> Unit) {
        val datalist = initTag(DataList(), init)
        datalist.applyModifier(modifier)
    }
    fun dd(modifier: Modifier = Modifier.Default, init: DD.() -> Unit) {
        val dd = initTag(DD(), init)
        dd.applyModifier(modifier)
    }
    fun del(modifier: Modifier = Modifier.Default, init: Del.() -> Unit) {
        val del = initTag(Del(), init)
        del.applyModifier(modifier)
    }
    fun details(modifier: Modifier = Modifier.Default, init: Details.() -> Unit) {
        val details = initTag(Details(), init)
        details.applyModifier(modifier)
    }
    fun dfn(modifier: Modifier = Modifier.Default, init: Dfn.() -> Unit) {
        val dfn = initTag(Dfn(), init)
        dfn.applyModifier(modifier)
    }
    fun dir(modifier: Modifier = Modifier.Default,init: Dir.() -> Unit) {
        val dir = initTag(Dir(), init)
        dir.applyModifier(modifier)
    }
    fun div(modifier: Modifier = Modifier.Default,init: Div.() -> Unit) {
        val div = initTag(Div(), init)
        div.applyModifier(modifier)
    }
    fun dl(modifier: Modifier = Modifier.Default,init: Dl.() -> Unit) {
        val dl = initTag(Dl(), init)
        dl.applyModifier(modifier)
    }
    fun dt(modifier: Modifier = Modifier.Default,init: Dt.() -> Unit) {
        val dt = initTag(Dt(), init)
        dt.applyModifier(modifier)
    }
    fun em(modifier: Modifier = Modifier.Default,init: Em.() -> Unit) {
        val em = initTag(Em(), init)
        em.applyModifier(modifier)
    }
    fun embed(modifier: Modifier = Modifier.Default,init: Embed.() -> Unit) {
        val embed = initTag(Embed(), init)
        embed.applyModifier(modifier)
    }
    fun fieldset(modifier: Modifier = Modifier.Default,init: FieldSet.() -> Unit) {
        val fieldset = initTag(FieldSet(), init)
        fieldset.applyModifier(modifier)
    }
    fun figcaption(modifier: Modifier = Modifier.Default,init: FigCaption.() -> Unit) {
        val figcaption = initTag(FigCaption(), init)
        figcaption.applyModifier(modifier)
    }
    fun figure(modifier: Modifier = Modifier.Default,init: figure.() -> Unit) {
        val figure = initTag(figure(), init)
        figure.applyModifier(modifier)
    }
    fun font(modifier: Modifier = Modifier.Default,init: Font.() -> Unit) {
        val font = initTag(Font(), init)
        font.applyModifier(modifier)
    }
    fun footer(modifier: Modifier = Modifier.Default,init: Footer.() -> Unit) {
        val footer = initTag(Footer(), init)
        footer.applyModifier(modifier)
    }
    fun form(modifier: Modifier = Modifier.Default,init: Form.() -> Unit) {
        val form = initTag(Form(), init)
        form.applyModifier(modifier)
    }
    fun frame(modifier: Modifier = Modifier.Default,init: Frame.() -> Unit) {
        val frame = initTag(Frame(), init)
        frame.applyModifier(modifier)
    }
    fun frameset(modifier: Modifier = Modifier.Default,init: FrameSet.() -> Unit) {
        val frameset = initTag(FrameSet(), init)
        frameset.applyModifier(modifier)
    }
    fun hgroup(modifier: Modifier = Modifier.Default,init: HGroup.() -> Unit) {
        val hgroup = initTag(HGroup(), init)
        hgroup.applyModifier(modifier)
    }
    fun hr(modifier: Modifier = Modifier.Default,init: Hr.() -> Unit) {
        val hr = initTag(Hr(), init)
        hr.applyModifier(modifier)
    }
    fun i(modifier: Modifier = Modifier.Default,init: I.() -> Unit) {
        val i = initTag(I(), init)
        i.applyModifier(modifier)
    }
    fun iframe(modifier: Modifier = Modifier.Default,init: IFrame.() -> Unit) {
        val iframe = initTag(IFrame(), init)
        iframe.applyModifier(modifier)
    }
    fun img(modifier: Modifier = Modifier.Default,init: Img.() -> Unit) {
        val img = initTag(Img(), init)
        img.applyModifier(modifier)
    }
    fun input(modifier: Modifier = Modifier.Default,init: Input.() -> Unit) {
        val input = initTag(Input(), init)
        input.applyModifier(modifier)
    }
    fun ins(modifier: Modifier = Modifier.Default,init: Ins.() -> Unit) {
        val ins = initTag(Ins(), init)
        ins.applyModifier(modifier)
    }
    fun isindex(modifier: Modifier = Modifier.Default,init: IsIndex.() -> Unit) {
        val isindex = initTag(IsIndex(), init)
        isindex.applyModifier(modifier)
    }
    fun kbd(modifier: Modifier = Modifier.Default,init: KBD.() -> Unit) = {
        val kbd = initTag(KBD(), init)
        kbd.applyModifier(modifier)
    }
    fun keygen(modifier: Modifier = Modifier.Default,init: KeyGen.() -> Unit) {
        val keygen = initTag(KeyGen(), init)
        keygen.applyModifier(modifier)
    }
    fun label(modifier: Modifier = Modifier.Default,init: Label.() -> Unit) {
        val label = initTag(Label(), init)
        label.applyModifier(modifier)
    }
    fun legend(modifier: Modifier = Modifier.Default,init: Legend.() -> Unit) {
        val legend = initTag(Legend(), init)
        legend.applyModifier(modifier)
    }
    fun li(modifier: Modifier = Modifier.Default,init: Li.() -> Unit) {
        val li = initTag(Li(), init)
        li.applyModifier(modifier)
    }
    fun link(modifier: Modifier = Modifier.Default,init: Link.() -> Unit) {
        val link = initTag(Link(), init)
        link.applyModifier(modifier)
    }
    fun listing(modifier: Modifier = Modifier.Default,init: Listing.() -> Unit) {
        val listing = initTag(Listing(), init)
        listing.applyModifier(modifier)
    }
    fun main(modifier: Modifier = Modifier.Default,init: Main.() -> Unit) {
        val main = initTag(Main(), init)
        main.applyModifier(modifier)
    }
    fun map(modifier: Modifier = Modifier.Default,init: Map.() -> Unit) {
        val map = initTag(Map(), init)
        map.applyModifier(modifier)
    }
    fun mark(modifier: Modifier = Modifier.Default,init: Mark.() -> Unit) {
        val mark = initTag(Mark(), init)
        mark.applyModifier(modifier)
    }
    fun marquee(modifier: Modifier = Modifier.Default,init: Marquee.() -> Unit) {
        val marquee = initTag(Marquee(), init)
        marquee.applyModifier(modifier)
    }
    fun menu(modifier: Modifier = Modifier.Default,init: Menu.() -> Unit) {
        val menu = initTag(Menu(), init)
        menu.applyModifier(modifier)
    }
    fun meta(modifier: Modifier = Modifier.Default,init: Meta.() -> Unit) {
        val meta = initTag(Meta(), init)
        meta.applyModifier(modifier)
    }
    fun meter(modifier: Modifier = Modifier.Default,init: Meter.() -> Unit) {
        val meter = initTag(Meter(), init)
        meter.applyModifier(modifier)
    }
    fun multicoil(modifier: Modifier = Modifier.Default,init: MultiCoil.() -> Unit) {
        val multicoil = initTag(MultiCoil(), init)
        multicoil.applyModifier(modifier)
    }
    fun nav(modifier: Modifier = Modifier.Default,init: Nav.() -> Unit) {
        val nav = initTag(Nav(), init)
        nav.applyModifier(modifier)
    }
    fun nobr(modifier: Modifier = Modifier.Default,init: Nobr.() -> Unit) {
        val nobr = initTag(Nobr(), init)
        nobr.applyModifier(modifier)
    }
    fun noembed(modifier: Modifier = Modifier.Default,init: Noembed.() -> Unit) {
        val noembed = initTag(Noembed(), init)
        noembed.applyModifier(modifier)
    }
    fun noframes(modifier: Modifier = Modifier.Default,init: NoFrames.() -> Unit) {
        val noframes = initTag(NoFrames(), init)
        noframes.applyModifier(modifier)
    }
    fun noscript(modifier: Modifier = Modifier.Default,init: NoScript.() -> Unit) {
        val noscript = initTag(NoScript(), init)
        noscript.applyModifier(modifier)
    }
    fun object_(modifier: Modifier = Modifier.Default,init: Object.() -> Unit) {
        val object_ = initTag(Object(), init)
        object_.applyModifier(modifier)
    }
    fun ol(modifier: Modifier = Modifier.Default,init: Ol.() -> Unit) {
        val ol = initTag(Ol(), init)
        ol.applyModifier(modifier)
    }
    fun optgroup(modifier: Modifier = Modifier.Default,init: OptGroup.() -> Unit) {
        val optgroup = initTag(OptGroup(), init)
        optgroup.applyModifier(modifier)
    }
    fun option(modifier: Modifier = Modifier.Default,init: Option.() -> Unit) {
        val option = initTag(Option(), init)
        option.applyModifier(modifier)
    }
    fun output(modifier: Modifier = Modifier.Default,init: Output.() -> Unit) {
        val output = initTag(Output(), init)
        output.applyModifier(modifier)
    }
    fun param(modifier: Modifier = Modifier.Default,init: Param.() -> Unit) {
        val param = initTag(Param(), init)
        param.applyModifier(modifier)
    }
    fun plaintext(modifier: Modifier = Modifier.Default,init: PlainText.() -> Unit) {
        val plaintext = initTag(PlainText(), init)
        plaintext.applyModifier(modifier)
    }
    fun pre(modifier: Modifier = Modifier.Default,init: Pre.() -> Unit) {
        val pre = initTag(Pre(), init)
        pre.applyModifier(modifier)
    }
    fun progress(modifier: Modifier = Modifier.Default,init: Progress.() -> Unit) {
        val progress = initTag(Progress(), init)
        progress.applyModifier(modifier)
    }
    fun q(modifier: Modifier = Modifier.Default,init: Q.() -> Unit) {

    }
    fun rp(modifier: Modifier = Modifier.Default,init: RP.() -> Unit) {
        val rp = initTag(RP(), init)
        rp.applyModifier(modifier)
    }
    fun rt(modifier: Modifier = Modifier.Default,init: RT.() -> Unit) {
        val rt = initTag(RT(), init)
        rt.applyModifier(modifier)
    }
    fun ruby(modifier: Modifier = Modifier.Default,init: Ruby.() -> Unit) {
        val ruby = initTag(Ruby(), init)
        ruby.applyModifier(modifier)
    }
    fun s(modifier: Modifier = Modifier.Default,init: S.() -> Unit) {
        val s = initTag(S(), init)
        s.applyModifier(modifier)
    }
    fun samp(modifier: Modifier = Modifier.Default,init: Samp.() -> Unit) {
        val samp = initTag(Samp(), init)
        samp.applyModifier(modifier)
    }
    fun script(modifier: Modifier = Modifier.Default,init: Script.() -> Unit) {
        val script = initTag(Script(), init)
        script.applyModifier(modifier)
    }
    fun section(modifier: Modifier = Modifier.Default,init: Section.() -> Unit) {
        val section = initTag(Section(), init)
        section.applyModifier(modifier)
    }
    fun select(modifier: Modifier = Modifier.Default,init: Select.() -> Unit) {
        val select = initTag(Select(), init)
        select.applyModifier(modifier)
    }
    fun small(modifier: Modifier = Modifier.Default,init: Small.() -> Unit) {
        val small = initTag(Small(), init)
        small.applyModifier(modifier)
    }
    fun source(modifier: Modifier = Modifier.Default,init: Source.() -> Unit) {
        val source = initTag(Source(), init)
        source.applyModifier(modifier)
    }
    fun spacer(modifier: Modifier = Modifier.Default,init: Spacer.() -> Unit) {
        val spacer = initTag(Spacer(), init)
        spacer.applyModifier(modifier)
    }
    fun span(modifier: Modifier = Modifier.Default,init: Span.() -> Unit) {
        val span = initTag(Span(), init)
        span.applyModifier(modifier)
    }
    fun strike(modifier: Modifier = Modifier.Default,init: Strike.() -> Unit) {
        val strike = initTag(Strike(), init)
        strike.applyModifier(modifier)
    }
    fun strong(modifier: Modifier = Modifier.Default,init: Strong.() -> Unit) {
        val strong = initTag(Strong(), init)
        strong.applyModifier(modifier)
    }
    fun style(modifier: Modifier = Modifier.Default,init: Style.() -> Unit) {
        val style = initTag(Style(), init)
        style.applyModifier(modifier)
    }
    fun sub(modifier: Modifier = Modifier.Default,init: Sub.() -> Unit) {
        val sub = initTag(Sub(), init)
        sub.applyModifier(modifier)
    }
    fun summary(modifier: Modifier = Modifier.Default,init: Summary.() -> Unit) {
        val summary = initTag(Summary(), init)
        summary.applyModifier(modifier)
    }
    fun sup(modifier: Modifier = Modifier.Default,init: Sup.() -> Unit) {
        val sup = initTag(Sup(), init)
        sup.applyModifier(modifier)
    }
    fun table(modifier: Modifier = Modifier.Default,init: Table.() -> Unit) {
        val table = initTag(Table(), init)
        table.applyModifier(modifier)
    }
    fun tbody(modifier: Modifier = Modifier.Default,init: TBody.() -> Unit) {
        val tbody = initTag(TBody(), init)
        tbody.applyModifier(modifier)
    }
    fun td(modifier: Modifier = Modifier.Default,init: Td.() -> Unit) {
        val td = initTag(Td(), init)
        td.applyModifier(modifier)
    }
    fun textarea(modifier: Modifier = Modifier.Default,init: TextArea.() -> Unit) {
        val textarea = initTag(TextArea(), init)
        textarea.applyModifier(modifier)
    }
    fun tfoot(modifier: Modifier = Modifier.Default,init: TFoot.() -> Unit) {
        val tfoot = initTag(TFoot(), init)
        tfoot.applyModifier(modifier)
    }
    fun th(modifier: Modifier = Modifier.Default,init: Th.() -> Unit) {
        val th = initTag(Th(), init)
        th.applyModifier(modifier)
    }
    fun thead(modifier: Modifier = Modifier.Default,init: THead.() -> Unit) {
        val thead = initTag(THead(), init)
        thead.applyModifier(modifier)
    }
    fun time(modifier: Modifier = Modifier.Default,init: Time.() -> Unit) {
        val time = initTag(Time(), init)
        time.applyModifier(modifier)
    }
    fun tr(modifier: Modifier = Modifier.Default,init: Tr.() -> Unit) {
        val tr = initTag(Tr(), init)
        tr.applyModifier(modifier)
    }
    fun track(modifier: Modifier = Modifier.Default,init: Track.() -> Unit) {
        val track = initTag(Track(), init)
        track.applyModifier(modifier)
    }
    fun tt(modifier: Modifier = Modifier.Default,init: TT.() -> Unit) {
        val tt = initTag(TT(), init)
        tt.applyModifier(modifier)
    }
    fun u(modifier: Modifier = Modifier.Default,init: U.() -> Unit) {
        val u = initTag(U(), init)
        u.applyModifier(modifier)
    }
    fun ul(modifier: Modifier = Modifier.Default,init: UL.() -> Unit) {
        val ul = initTag(UL(), init)
        ul.applyModifier(modifier)
    }
    fun var_(modifier: Modifier = Modifier.Default,init: Var.() -> Unit) {
        val var_ = initTag(Var(), init)
        var_.applyModifier(modifier)
    }
    fun video(modifier: Modifier = Modifier.Default,init: Video.() -> Unit) {
        val video = initTag(Video(), init)
        video.applyModifier(modifier)
    }
    fun wbr(modifier: Modifier = Modifier.Default,init: WBR.() -> Unit) {
        val wbr = initTag(WBR(), init)
        wbr.applyModifier(modifier)
    }
    fun xmp(modifier: Modifier = Modifier.Default,init: XMP.() -> Unit) {
        val xmp = initTag(XMP(), init)
        xmp.applyModifier(modifier)
    }
    fun base(modifier: Modifier = Modifier.Default,init: Base.() -> Unit) {
        val base = initTag(Base(), init)
        base.applyModifier(modifier)
    }
    fun basefont(modifier: Modifier = Modifier.Default,init: BaseFont.() -> Unit) {
        val basefont = initTag(BaseFont(), init)
        basefont.applyModifier(modifier)
    }

}