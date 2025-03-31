package com.performance.module_1_119

class Feature119UseCase2(
    private val repository: Feature119Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
