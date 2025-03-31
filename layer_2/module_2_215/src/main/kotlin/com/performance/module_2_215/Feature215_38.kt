package com.performance.module_2_215

class Feature215UseCase2(
    private val repository: Feature215Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
