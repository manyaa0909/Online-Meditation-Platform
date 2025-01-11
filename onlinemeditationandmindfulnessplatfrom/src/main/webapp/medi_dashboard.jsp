<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meditation & Mindfulness Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            color: #333;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 1200px;
            margin: 0 auto;
        }
        h1 {
            text-align: center;
            color: #4a90e2;
        }
        .card {
            background-color: #fff;
            border-radius: 10px;
            padding: 20px;
            margin: 20px 0;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .card h2 {
            color: #4a90e2;
        }
        .flex-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }
        .flex-item {
            flex: 1;
            min-width: 250px;
            margin: 10px;
        }
        button {
            background-color: #4a90e2;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #357ABD;
        }
        .tracker-display {
            font-size: 1.5em;
            margin-top: 10px;
        }
        .music-player {
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Your Mindfulness Dashboard</h1>

        <div class="flex-container">
            <!-- Sleep Tracker Section -->
            <div class="flex-item card">
                <h2>Sleep Tracker</h2>
                <p>Track your sleep patterns and get insights to improve your rest.</p>
                <button onclick="trackSleep()">Track Sleep</button>
                <div id="sleepData" class="tracker-display">No data recorded yet</div>
            </div>

            <!-- Relaxation Music Section -->
            <div class="flex-item card">
                <h2>Relaxation Music</h2>
                <p>Listen to calming music to help you relax and meditate.</p>
                <audio class="music-player" controls>
                    <source src="relaxation-music.mp3" type="audio/mpeg">
                    Your browser does not support the audio element.
                </audio>
            </div>

            <!-- Deep Breathing Exercise Section -->
            <div class="flex-item card">
                <h2>Deep Breathing Exercise</h2>
                <p>Follow along to practice deep breathing and reduce stress.</p>
                <button onclick="startBreathingExercise()">Start Exercise</button>
                <div id="breathingCount" class="tracker-display">Breathe in... 0</div>
            </div>

            <!-- Personalized Experience Section -->
            <div class="flex-item card">
                <h2>Personalized Recommendations</h2>
                <p>Get tailored meditation and mindfulness exercises based on your usage.</p>
                <button onclick="showRecommendations()">Show Recommendations</button>
                <ul id="recommendationsList"></ul>
            </div>
        </div>
    </div>

    <script>
        // Sleep Tracker Mock Function
        function trackSleep() {
            const sleepHours = prompt("Enter your sleep duration in hours:");
            if (sleepHours) {
                document.getElementById("sleepData").textContent = `You slept for ${sleepHours} hours last night.`;
            } else {
                document.getElementById("sleepData").textContent = "No data recorded.";
            }
        }

        // Deep Breathing Exercise Mock Function
        let breathCount = 0;
        let breathingInterval;
        
        function startBreathingExercise() {
            breathCount = 0;
            clearInterval(breathingInterval);
            breathingInterval = setInterval(() => {
                breathCount++;
                document.getElementById("breathingCount").textContent = `Breathe in... ${breathCount}`;
                if (breathCount === 10) {
                    clearInterval(breathingInterval);
                    alert("Great job! You've completed the breathing exercise.");
                }
            }, 3000); // 3 seconds per breath
        }

        // Personalized Recommendations Mock Function
        function showRecommendations() {
            const recommendations = [
                "Guided Meditation for Stress Relief",
                "10-Minute Body Scan Meditation",
                "Mindful Walking Exercise",
                "Evening Relaxation Routine"
            ];
            const listElement = document.getElementById("recommendationsList");
            listElement.innerHTML = ""; // Clear previous recommendations
            recommendations.forEach(item => {
                const li = document.createElement("li");
                li.textContent = item;
                listElement.appendChild(li);
            });
        }
    </script>
</body>
</html>
