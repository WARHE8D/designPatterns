# Proxy Pattern

A **structural design pattern** where a proxy object controls access to a real object.
It helps **delay creation**, **reduce expensive calls**, and **add access control**
without changing the real object.

## Why use it?

- Avoid repeated calls to resource-expensive methods
- Create objects only when needed (lazy loading)
- Control access based on conditions (e.g., login)

## Use Case (MyAnimeList)

When opening the homepage:

- `getTopSeasonalAnime()` → visible to everyone
- `getRecommendedAnime(User user)` → visible only after login

Problem:

- `getTopSeasonalAnime()` gets called again after login, causing duplicate work

## Solution

- A **proxy** wraps the real MyAnimeList object
- The real object is created **only once**
- `getTopSeasonalAnime()` is reused
- `getRecommendedAnime()` is shown **only if the user is logged in**

## Key Benefits

- Reduces unnecessary method calls
- Improves performance
- Adds access control without modifying core logic
