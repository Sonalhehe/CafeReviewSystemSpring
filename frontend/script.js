const api = "http://localhost:8080/api/cafes";

fetch(api)
  .then(res => res.json())
  .then(data => {
    const container = document.getElementById("cafes");
    data.forEach(cafe => {
      const div = document.createElement("div");
      div.className = "cafe";
      div.innerHTML = `<h3>${cafe.name}</h3>
                       <p>Location: ${cafe.location}</p>
                       <p>Cuisine: ${cafe.cuisine}</p>
                       <p>Avg Cost: ₹${cafe.avgCost}</p>`;
      container.appendChild(div);
    });
  });
