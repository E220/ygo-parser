import cards.base.BaseCard;
import cards.base.Card;
import repository.InMemoryArrayListReadOnlyRepository;
import repository.ReadOnlyRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Card> mockBaseCards = List.of(
                new BaseCard(1, "Tri-Horned Dragon", "An unworthy dragon with three sharp horns sprouting from its head."),
                new BaseCard(2, "Blue-Eyes White Dragon", "This legendary dragon is a powerful engine of destruction. Virtually invincible, very few have faced this awesome creature and lived to tell the tale."),
                new BaseCard(3, "Hitotsu-Me Giant", "A one-eyed behemoth with thick, powerful arms made for delivering punishing blows."),
                new BaseCard(4, "Flame Swordsman", "\"Flame Manipulator\" + \"Masaki the Legendary Swordsman\""),
                new BaseCard(5, "Skull Servant", "A skeletal ghost that isn't strong but can mean trouble in large numbers."),
                new BaseCard(6, "Dark Magician", "The ultimate wizard in terms of attack and defense."),
                new BaseCard(7, "Gaia The Fierce Knight", "A knight whose horse travels faster than the wind. His battle-charge is a force to be reckoned with."),
                new BaseCard(8, "Celtic Guardian", "An elf who learned to wield a sword, he baffles enemies with lightning-swift attacks."),
                new BaseCard(9, "Basic Insect", "Usually found traveling in swarms, this creature's ideal environment is the forest."),
                new BaseCard(10, "Mammoth Graveyard", "A mammoth that protects the graves of its pack and is absolutely merciless when facing grave-robbers."),
                new BaseCard(11, "Silver Fang", "A snow wolf that's beautiful to the eye, but absolutely vicious in battle."),
                new BaseCard(12, "Dark Gray", "Entirely gray, this beast has rarely been seen by mortal eyes."),
                new BaseCard(13, "Trial of Nightmare", "This fiend passes judgment on enemies that are locked in coffins."),
                new BaseCard(14, "Nemuriko", "A child-like creature that controls a sleep fiend to beckon enemies into eternal slumber."),
                new BaseCard(15, "The 13th Grave", "A zombie that suddenly appeared from plot #13 - an empty grave."),
                new BaseCard(16, "Charubin the Fire Knight", "\"Monster Egg\" + \"Hinotama Soul\""),
                new BaseCard(17, "Flame Manipulator", "This Spellcaster attacks enemies with fire-related spells such as \"Sea of Flames\" and \"Wall of Fire\"."),
                new BaseCard(18, "Monster Egg", "A warrior hidden within an egg that attacks enemies by flinging eggshells."),
                new BaseCard(19, "Firegrass", "A fire-breathing plant found growing near volcanoes."),
                new BaseCard(20, "Darkfire Dragon", "\"Firegrass\" + \"Petit Dragon\""),
                new BaseCard(21, "Dark King of the Abyss", "It's said that this King of the Netherworld once had the power to rule over the dark.")
        );
        final ReadOnlyRepository<Card, Integer> mockBaseCardRepo = new InMemoryArrayListReadOnlyRepository<>(mockBaseCards);
        System.out.println(mockBaseCardRepo.get(1));
    }
}