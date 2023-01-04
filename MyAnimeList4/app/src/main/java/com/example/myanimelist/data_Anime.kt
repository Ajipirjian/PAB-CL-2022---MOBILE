package com.example.myanimelist

object data_Anime {
    private val judulanime = arrayOf(
        "Bleach: Sennen Kessen-hen",
        "Kaguya-sama wa Kokurasetai: Ultra Romantic",
        "Bocchi the Rock!",
        "Koe no Katachi",
        "Kimi no Na wa",
        "Kimetsu no Yaiba: Yuukaku-hen",
        "Mob Psycho 100 III",
        "Mushoku Tensei: Isekai Ittara Honki Dasu Part 2",
        "Spy x Family",
        "Fate/stay night Movie: Heaven's Feel - III. Spring Song",
        "Made in Abyss: Retsujitsu no Ougonkyou",
        "Seishun Buta Yarou wa Yumemiru Shoujo no Yume wo Minai",
        "Ousama Ranking",
        "Kimi no Suizou wo Tabetai",
        "Yuru Camp△ Movie",
        "Ansatsu Kyoushitsu 2nd Season"

    )

    private val genreanime = arrayOf(
        "Genres: Action, Adventure, Fantasy",
        "Genres: Comedy, Romance",
        "Genres: Comedy, Slice Of Life, Music",
        "Genres: Drama, School, Shounen",
        "Genres: Drama, Supernatural",
        "Genres: Action, Fantasy",
        "Genres: Action, Comedy, Supernatural",
        "Genres: Drama, Fantasy, Ecchi",
        "Genres: Action, Comedy",
        "Genres: Action, Fantasy, Supernatural",
        "Genres: Adventure, Drama, Fantasy, Mystery, Sci-Fi",
        "Genres: Drama, Romance, Supernatural",
        "Genres: Adventure, Fantasy",
        "Genres: Drama, Romance",
        "Genre: Slice of Life",
        "Genres: Action, Comedy",

    )

    private val infoanime = arrayOf(
        "Studios: Pierrot, Score: 9.21, Ranked: #1, Type: Tv",
        "Studios: A-1 Pictures, Score: 9.08, Ranked: #32, Type: Tv",
        "Studios: CloverWorks, Score: 9.021, Ranked: #12, Type: Tv ",
        "Studios: Kyoto Animation, Score: 8.94, Ranked: #18, Type: Movie ",
        "Studios: CoMix Wave Films, Score: 8.85, Ranked: #24, Type: Movie",
        "Studios: ufotable, Score: 8.83, Ranked: #26, Type: Movie",
        "Studios: Bones, Score: 8.77, Ranked: #37, Type: Tv ",
        "Studios: Studio Bind, Score: 8.71, Ranked: #48, Type: Tv",
        "Studios: Wit Studio, CloverWorks, Score: 8.70, Ranked: #52, Type: Tv",
        "Studios: ufotable, Score: 8.69, Ranked: #54, Type: Movie",
        "Studios: Kinema Citrus, Score: 8.69, Ranked: #56, Type: Tv",
        "Studios: CloverWorks, Score: 8.61, Ranked: #79, Type: Movie ",
        "Studios: Wit Studio, Score: 8.57, Ranked: #89, Type: Tv",
        "Studios: Studio VOLN, Score: 8.56, Ranked: #96, Type: Movie ",
        "Studios: C-Station, Score: 8.50, Ranked: #118, Type: Tv ",
        "Studios: Lerche, Score: 8.50, Ranked: #121, Type: Tv "


    )
    private val sinopsis = arrayOf(
        "Substitute Soul Reaper Ichigo Kurosaki spends his days fighting against Hollows, dangerous" +
                " evil spirits that threaten Karakura Town. Ichigo carries out his quest with his " +
                "closest allies: Orihime Inoue, his childhood friend with a talent for healing; " +
                "Yasutora Sado, his high school classmate with superhuman strength; and Uryuu Ishida," +
                " Ichigo's Quincy rival \n \n " +
                "Ichigo's vigilante routine is disrupted by the sudden appearance of Asguiaro Ebern," +
                " a dangerous Arrancar who heralds the return of Yhwach, an ancient Quincy king. " +
                "Yhwach seeks to reignite the historic blood feud between Soul Reaper and Quincy, " +
                "and he sets his sights on erasing both the human world and the Soul Society for good.\n \n " +
                "Yhwach launches a two-pronged invasion into both the Soul Society and Hueco Mundo," +
                " the home of Hollows and Arrancar. In retaliation, Ichigo and his friends must " +
                "fight alongside old allies and enemies alike to end Yhwach's campaign of carnage" +
                " before the world itself comes to an end.",

        "The elite members of Shuchiin Academy's student council continue their competitive day-to-day" +
                " antics. Council president Miyuki Shirogane clashes daily against vice-president " +
                "Kaguya Shinomiya, each fighting tooth and nail to trick the other into confessing" +
                " their romantic love. Kaguya struggles within the strict confines of her wealthy, " +
                "uptight family, rebelling against her cold default demeanor as she warms to Shirogane" +
                " and the rest of her friends. \n \n" +
                "Meanwhile, council treasurer Yuu Ishigami suffers under the weight of his hopeless " +
                "crush on Tsubame Koyasu, a popular upperclassman who helps to instill a new " +
                "confidence in him. Miko Iino, the newest student council member, grows closer to " +
                "the rule-breaking Ishigami while striving to overcome her own authoritarian moral code.\n \n" +
                "As love further blooms at Shuchiin Academy, the student council officers drag their" +
                " outsider friends into increasingly comedic conflicts.",

        "Yearning to make friends and perform live with a band, lonely and socially anxious " +
                "Hitori Gotou devotes her time to playing the guitar. On a fateful day, Bocchi meets" +
                " the outgoing drummer Nijika Ijichi, who invites her to join Kessoku Band when their " +
                "guitarist, Ikuyo Kita, flees before their first show. Soon after, Bocchi meets her" +
                " final bandmate—the cool bassist Ryou Yamada.\n \n " +
                "Although their first performance together is subpar, the girls feel empowered by " +
                "their shared love for music, and they are soon rejoined by Kita. Finding happiness" +
                " in performing, Bocchi and her bandmates put their hearts into improving as " +
                "musicians while making the most of their fleeting high school days.",

        "As a wild youth, elementary school student Shouya Ishida sought to beat boredom in the " +
                "cruelest ways. When the deaf Shouko Nishimiya transfers into his class, Shouya and " +
                "the rest of his class thoughtlessly bully her for fun. However, when her mother" +
                " notifies the school, he is singled out and blamed for everything done to her. " +
                "With Shouko transferring out of the school, Shouya is left at the mercy of his " +
                "classmates. He is heartlessly ostracized all throughout elementary and middle school, " +
                "while teachers turn a blind eye. \n \n",

        "Now in his third year of high school, Shouya is still plagued by his wrongdoings as a " +
                "young boy. Sincerely regretting his past actions, he sets out on a journey of " +
                "redemption: to meet Shouko once more and make amends.\n \n" +
                "Koe no Katachi tells the heartwarming tale of Shouya reunion with Shouko and his" +
                " honest attempts to redeem himself, all while being continually haunted by the" +
                " shadows of his past.",

        "Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city" +
                " of Tokyo—a dream that stands in stark contrast to her present life in the " +
                "countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high " +
                "school student while juggling his part-time job and hopes for a future in architecture.\n \n" +
                " One day, Mitsuha awakens in a room that is not her own and suddenly finds herself " +
                "living the dream life in Tokyo—but in Taki's body! Elsewhere, Taki finds himself " +
                "living Mitsuha's life in the humble countryside. In pursuit of an answer to this " +
                "strange phenomenon, they begin to search for one another.\n \n" +
                " Kimi no Na wa. revolves around Mitsuha and Taki  actions, which begin to have a " +
                "dramatic impact on each other s lives, weaving them into a fabric held together by" +
                " fate and circumstance.",

        "The devastation of the Mugen Train incident still weighs heavily on the members of the " +
                "Demon Slayer Corps. Despite being given time to recover, life must go on, as the" +
                " wicked never sleep: a vicious demon is terrorizing the alluring women of the " +
                "Yoshiwara Entertainment District.\n \n" +
                "The Sound Pillar, Tengen Uzui, and his three wives are on the case. However," +
                " when he soon loses contact with his spouses, Tengen fears the worst and enlists" +
                " the help of Tanjirou Kamado, Zenitsu Agatsuma, and Inosuke Hashibira to " +
                "infiltrate the district's most prominent houses and locate the depraved Upper Rank" +
                " demon.",

        "After foiling a world-threatening plot, Shigeo Kageyama returns to tackle the more " +
                "exhausting aspects of his mundane life—starting with filling out his school's" +
                " nerve-racking career form. Meanwhile, he continues to assist his mentor " +
                "Arataka Reigen and the office's new recruit, Katsuya Serizawa, in solving " +
                "paranormal cases of their clients. While continuing his duties, Mob also works on " +
                "gaining more independence in his esper and human lives, as well as trying to " +
                "integrate better with the people around him.\n\n " +
                "However, new supernatural and ordinary challenges test Mob’s emotional stability" +
                " and force him to confront the realities around him. As he strives to continue " +
                "forward on the path to maturity, Mob must resolve his emotional crises and reassess" +
                " the naivety he has held on for so long.",

        "After the mysterious mana calamity, Rudeus Greyrat and his fierce student Eris Boreas " +
                "Greyrat are teleported to the Demon Continent. There, they team up with their " +
                "newfound companion Ruijerd Supardia—the former leader of the Superd's Warrior " +
                "group—to form Dead End, a successful adventurer party. Making a name for " +
                "themselves, the trio journeys across the continent to make their way back home " +
                "to Fittoa.\n \n " +
                "Following the advice he received from the faceless god Hitogami, " +
                "Rudeus saves Kishirika Kishirisu, the Great Emperor of the Demon World, " +
                "who rewards him by granting him a strange power. Now, as Rudeus masters the " +
                "powerful ability that offers a number of new opportunities, it might prove to be " +
                "more than what he bargained for when unexpected dangers threaten to hinder their travels.",

        "Corrupt politicians, frenzied nationalists, and other warmongering forces constantly jeopardize" +
                " the thin veneer of peace between neighboring countries Ostania and Westalis. " +
                "In spite of their plots, renowned spy and master of disguise Twilight fulfills" +
                " dangerous missions one after another in the hope that no child will have to experience" +
                " the horrors of war.\n \n " +
                "In the bustling Ostanian city of Berlint, Twilight dons the alias of Loid Forger an " +
                "esteemed psychiatrist. However, his true intention is to gather intelligence on " +
                "prominent politician Donovan Desmond, who only appears rarely in public at his sons' " +
                "school: the prestigious Eden Academy. Enlisting the help of unmarried city hall clerk " +
                "Yor Briar to act as his wife and adopting the curious six-year-old orphan Anya as his" +
                " daughter, Loid enacts his master plan. He will enroll Anya in Eden Academy, where Loid " +
                "hopes she will excel and give him the opportunity to meet Donovan without arousing " +
                "suspicion.\n \n " +
                "Unfortunately for Loid, even a man of his talents has trouble playing the figure of a" +
                " loving father and husband. And just like Loid is hiding his true identity, Yor—who is " +
                "an underground assassin known as Thorn Princess and Anya—an esper who can read people's " +
                "minds—have no plans to disclose their own secrets either. Although this picture-perfect " +
                "family is founded on deception, the Forgers gradually come to understand that the love " +
                "they share for one another trumps all else.",

        "The Fifth Holy Grail War in Fuyuki City has reached a turning point in which the lives of " +
                "all participants are threatened as the hidden enemy finally reveals itself. " +
                "As Shirou Emiya, Rin Toosaka, and Illyasviel von Einzbern discover the true, " +
                "corruptive nature of the shadow that has been rampaging throughout the city, " +
                "they realize just how dire the situation is. In order to protect their beloved ones," +
                "the group must hold their own against the seemingly insurmountable enemy force even " +
                "if some of those foes were once their allies, or perhaps, something more intimate.\n \n " +
                "As the final act of this chaotic war commences, the ideals Shirou believes will " +
                "soon be challenged by an excruciating dilemma: is it really possible to save a" +
                " world where everything seems to have gone wrong?",

        "After surviving the brutal challenges of Idofront, Riko now possesses a White Whistle, " +
                "allowing her to descend into the Abyss's sixth layer The Capital of the Unreturned." +
                " Alongside Reg and Nanachi, Riko begins to explore the uncharted domain, where the" +
                " ruins of the promised Golden City are located. \n \n" +
                " As the trio starts to adapt to the harsh environment, " +
                "they soon encounter dangerous creatures and treacherous landscapes. " +
                "Their expedition leads them to a village inhabited by strange beings known as hollows" +
                " Despite the creeping sense of unease that welcomes them, the three venture onward " +
                "to uncover the mysteries of the settlement and long-lost legacies of the forgotten " +
                "adventurers who once descended into the horrors of the unexplored Abyss.",

        "Six months ago, Sakuta Azusagawa had a chance encounter with a bunny girl in a library. " +
                "Ever since then, he's been blissfully happy with his girlfriend: Mai Sakurajima, " +
                "that same bunny girl. However, the reappearance of his mysterious first crush, " +
                "the now-adult Shouko Makinohara, adds a new complication to his relationship with " +
                "Mai. To make matters worse, he then encounters a middle school Shouko in the hospital" +
                ", suffering from a grave illness. Mysteriously, his old scars begin throbbing " +
                "whenever he's near her.\n \n" +
                " With Shouko's bizarre situation somehow revolving around him, Sakuta will need to " +
                "come to terms with his own conflicting feelings, for better or worse. With a girl's " +
                "life in his hands, just what can he do?",

    "The people of the kingdom look down on the young Prince Bojji, who can neither hear nor speak." +
            " They call him The usseless Prince while jeering at his supposed foolishness.\n \n" +
            "However, while Bojji may not be physically strong, he is certainly not weak of heart. " +
            "When a chance encounter with a shadow creature should have left him traumatized, " +
            "it instead makes him believe that he has found a friend amidst those who only choose" +
            " to notice his shortcomings. He starts meeting with Kage, the shadow, regularly, " +
            "to the point where even the otherwise abrasive creature begins to warm up to him.\n \n " +
            "Kage and Bojjis unlikely friendship lays the budding foundations of the prince's journey," +
            " one where he intends to conquer his fears and insecurities. Despite the constant ridicule" +
            " he faces, Bojji resolves to fulfill his desire of becoming the best king he can be." ,


    "Rin is a girl who likes camping near Mount Fuji. While bringing his bicycle, he went to the " +
            "camping site to enjoy the beautiful and calming view of Mount Fuji from the lakeside." +
            " On the way, he meets a girl named Nadeshiko who misses the last bus home because she " +
            "fell asleep in the camper's toilet. He finally chose to camp with Rin while enjoying " +
            "the night view of Mount Fuji.\n \n " +
            "The anime film will feature the familiar characters from the franchise now grown up, " +
            "and reuniting to construct a campsite" ,


    "Returning from their summer vacation, the students of Class 3-E at the prestigious Kunugigaoka " +
            "Middle School find themselves up against unbeatable odds. Faced with the possibility of " +
            "world annihilation, the students must come up with increasingly elaborate and creative" +
            " ways to kill their teacher, the cunning yet optimistic and helpful Koro-sensei.\n \n" +
            "However, eliminating Koro-sensei is not the only objective the students need to worry " +
            "about. Gakuhou Asano, the academy's merciless and cruel principal, seeks to prevent" +
            " Class 3-E's success by brainwashing his other hard-working pupils into ruthlessly" +
            " competitive studying machines. Hostility begins to linger in the air as traitors and " +
            "killers alike attempt to claim the bounty on Koro-sensei's head for themselves.\n \n" +
            "Nagisa Shiota, one of Class 3-E's most skilled assassins, finds himself in the middle " +
            "of the conflict. While he works to maintain his academic standing and prevent the end" +
            " of the world, domestic affairs jeopardize his place in Class 3-E. Together with his " +
            "dedicated classmates, he must now face the threats head-on."







    )
    private val photoanime = intArrayOf(
        R.drawable.satu,
        R.drawable.dua,
        R.drawable.tiga,
        R.drawable.empat,
        R.drawable.lima,
        R.drawable.enam,
        R.drawable.tujuh,
        R.drawable.delapan,
        R.drawable.sebelas,
        R.drawable.sepuluh,
        R.drawable.sebelas,
        R.drawable.duabelas,
        R.drawable.tigabelas,
        R.drawable.empatbelas,
        R.drawable.limabelas,
        R.drawable.enambelas

    )

    val listdata : ArrayList<animes>
    get() {
        val list = arrayListOf<animes>()
        for (position in judulanime.indices)
        {
            val anime = animes()
            anime.judul = judulanime[position]
            anime.genre = genreanime[position]
            anime.informasi = infoanime[position]
            anime.detail = sinopsis[position]
            anime.photo = photoanime[position]
            list.add(anime)

        }
        return list
    }

}