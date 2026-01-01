# Proxy Pattern

    Used to reduce method calls which are resource expensive
    Can also provide access control for these methods

# Use Case:

    When we open myanimelist we get to see:
    top seasonal animes,
    recomended animes for the user

    so when we open the homepage we get:
    getTopSeasonalAnime(),
    getRecomendedAnime(User user)

    getTopSeasonalAnime() shows animes for everyone wihout login
    and when user logs in he gets to see his personalized recomendation
    but we also call the getTopSeasonalAnime again to load in the homepage

# Solution:

    proxy makes it so that getTopSeasonalAnime gets called only once before and after login. 
    Coz getTopSeasonalAnime has to load anyway. 
    And recomemnded animes only gets displayed only when the user logs in so this is one of the access control.