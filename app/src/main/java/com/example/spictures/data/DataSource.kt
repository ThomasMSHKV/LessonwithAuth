package com.example.spictures.data

import com.example.spictures.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "We were at a great party yesterday",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://avatars.mds.yandex.net/get-kinopoisk-post-img/1101693/571698ac53f12a77b3aa3e4d33086746/960",
                    "Sally_111"
                )
            )
            list.add(
                BlogPost(
                    "Вчера был отличный день",
                    "The REST API course is complete. You can find the videos here: https://cod ingwithmitch.com/courses/build-a-rest-api/.",
                    "https://lh3.googleusercontent.com/proxy/QBsV9vwf6juTRG-ErrgiKXpE2-ZXZ44NI-FO8M9ea_SoN4g5MQmYKEyhgw4IfxtPA6-SoVJYLqp-exvPkzv4uwqIVihwo6Wi",
                    "mitch.404"
                )
            )

            list.add(
                BlogPost(
                    "Чаще проводите время с семьей",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "https://lh3.googleusercontent.com/proxy/-Ofn98_ajc5KosBTEZi762jvYyar8pwG2QYYyHg--UjNCccSbhbMgPcXLHfKTk4zWxoQP-Js0eaRaavN9FPUSofHGGHSkcNK4MM3BUuhMmQZn7bNnbP05h3V1W2huw",
                    "JohnStreets"
                )
            )
            list.add(
                BlogPost(
                    "This is the style",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "https://otvet.imgsmail.ru/download/190047839_5b8fd314919ee4f5f6cc03fb748f82f0_800.jpg",
                    "HermanTomeras"
                )
            )
            list.add(
                BlogPost(
                    "How do you like our new office",
                    "Freelancing as an Android developer with Donn Felker.\\r\\n\\r\\nDonn is also:\\r\\n\\r\\n1) Founder of caster.io\\r\\n\\r\\n2) Co-host of the fragmented podcast (fragmentedpodcast.com).",
                    "https://static.vitra.com/media/asset/1864940/storage/v_fullbleed_1440x/24012303.jpg",
                    "Chonov.Alexey"
                )
            )
            list.add(
                BlogPost(
                    "I really like this new social network Spictures",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://trendymen.ru/images/article1/130093/prev1130093.jpg",
                    "Bella.Poarch"
                )
            )
            list.add(
                BlogPost(
                    "My old photo",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "https://sun9-49.userapi.com/impg/0NXEN4vWdT5ZiJEGYLwrOq4Fv0NyaQW-8llVuA/ZHn_rSCUAG0.jpg?size=1080x689&quality=96&sign=efba57ea65c0d6984a7b301dfb26fbab&type=album",
                    "Oleg_Mereshkov"
                )
            )
            list.add(
                BlogPost(
                    "После тяжелой работы больше всего хочется, еще поработь",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "https://sun9-22.userapi.com/impg/re8ta97MvTP8PRd_63biioN65GRzH-tu5Cw5Xg/tNSXr05KCB8.jpg?size=1080x810&quality=96&sign=84f19cd944225d461810abf7fc2b3f72&type=album",
                    "MishaChanow"
                )
            )
            list.add(
                BlogPost(
                    "Что может быть лучше, чем гулять летом во время заката",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "https://sun9-19.userapi.com/impg/m5UjOezbiJ1dPACwJ9MjHJzDGQway6GxaBru3w/_DuA6tiYGNg.jpg?size=1080x721&quality=96&sign=40b3a18c23ae42078260cbf4fb4096b0&type=album",
                    "Sabina_Nalgieva"
                )
            )
            return list
        }
    }
}