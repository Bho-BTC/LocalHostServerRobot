
document.querySelector("form")?.addEventListener("submit", async (event) => {
    event.preventDefault();

    const botData = {
        name: (document.getElementById("name") as HTMLInputElement).value,
        health: (document.getElementById("health") as HTMLInputElement).value,
        attackDamage: (document.getElementById("attackDamage") as HTMLInputElement).value,
        attackRange: (document.getElementById("attackRange") as HTMLInputElement).value,
        movementRate: (document.getElementById("movementRate") as HTMLInputElement).value
    };


    const response = await fetch("http://localhost:8080/database/robots/post", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(botData)
    });

    document.getElementById("output")!.textContent = response.ok ? "✅ Bot created!" : "❌ Error creating bot!";
});
