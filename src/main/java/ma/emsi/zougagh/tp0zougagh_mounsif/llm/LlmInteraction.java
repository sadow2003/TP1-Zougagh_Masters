package ma.emsi.zougagh.tp0zougagh_mounsif.llm;

/**
 * Un "record" qui sert de conteneur de données pour une interaction complète avec le LLM.
 * Il contient la requête envoyée, la réponse brute reçue et la réponse textuelle extraite.
 */
public record LlmInteraction(
        String texteRequeteJson,
        String texteReponseJson,
        String reponseExtraite
) {
    // C'est tout ! Pas besoin de constructeur, de getters ou de méthodes equals/hashCode/toString.
    // Le 'record' s'en charge pour vous.
}
