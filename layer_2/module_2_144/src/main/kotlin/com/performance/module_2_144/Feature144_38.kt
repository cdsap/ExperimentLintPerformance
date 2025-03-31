package com.performance.module_2_144

class Feature144UseCase2(
    private val repository: Feature144Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
