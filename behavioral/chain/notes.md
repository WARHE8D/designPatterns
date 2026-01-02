# Chain of Responsibility Pattern

Genshin Impact Domains:
Imagine you are farming for some artifacts and you have 5 condensed resins,
1 fragile resin (40 original resin) and
200 original resin (60 original resin = 1 condensed resin)

After clearing a domain you manually choose condensed resin to get rewards and proceed redo the domain
After 5 condensed resins used and you feel lazy to go convert original resin to condensed
you select fragile resin to get your rewards
And after fragile resin you simply spend your original resin to get the rewards.

How Chain of responsibilities work is, it takes the chain of the order how you wanna spent your resources and does it
automatically for you.
So you can define your chain and let the pattern do the resource management for you.

condensed resin -(next chain)> fragile resin -> original resin -> end

Note: (unless you are insane) you can add an extra chain to get rewards using primos.